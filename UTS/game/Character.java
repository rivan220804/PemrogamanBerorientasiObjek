package UTS.game;

import java.util.*;

public abstract class Character {
    private final String name;
    private int health;
    private final int attackPower;
    protected final int maxHealth;

    private final List<StatusEffect> effects = new ArrayList<>();
    private boolean ignoreReductionOnce = false;

    protected Character(String name, int health, int attackPower) {
        if (health < 0 || attackPower < 0)
            throw new IllegalArgumentException("health dan attackPower harus >= 0");
        this.name = name;
        this.health = health;
        this.maxHealth = health;
        this.attackPower = attackPower;
    }

    public final String getName() { return name; }
    public final int getAttackPower() { return attackPower; }
    public final int getHealth() { return health; }
    public final int getMaxHealth() { return maxHealth; }

    protected final void setHealth(int value) {
        if (value < 0) value = 0;
        if (value > maxHealth) value = maxHealth;
        this.health = value;
    }

    protected int onIncomingDamage(int base) {
        int reduced = base;
        int totalFlatReduce = 0;
        for (StatusEffect e : new ArrayList<>(effects)) {
            if (e instanceof Shield) {
                totalFlatReduce += ((Shield) e).getFlatReduce();
            }
        }
        double factor = ignoreReductionOnce ? 0.75 : 1.0; 
        int appliedReduce = (int) Math.round(totalFlatReduce * factor);
        reduced -= appliedReduce;
        if (reduced < 0) reduced = 0;

      
        ignoreReductionOnce = false;
        return reduced;
    }

    final void setIgnoreReductionOnce(boolean v) { this.ignoreReductionOnce = v; }

    public final boolean isAlive() { return health > 0; }

    public final void takeDamage(int dmg) {
        int actual = Math.max(0, onIncomingDamage(dmg));
        int before = getHealth();
        setHealth(getHealth() - actual);
        System.out.println("  " + getName() + " HP: " + before + " -> " + getHealth());
    }

    public final void addEffect(StatusEffect e) {
        if (e == null) return;
        effects.add(e);
    }

    public final void performTurn(Character target) {
        if (!isAlive()) return;
        for (StatusEffect e : new ArrayList<>(effects)) e.onTurnStart(this);
        attack(target);
        for (StatusEffect e : new ArrayList<>(effects)) e.onTurnEnd(this);

        // remove expired
        Iterator<StatusEffect> it = effects.iterator();
        while (it.hasNext()) {
            if (it.next().isExpired()) it.remove();
        }
    }

    public abstract void attack(Character target);
}
