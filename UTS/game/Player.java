package UTS.game;

import java.util.*;

public class Player extends Character {
    private final int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        if (level < 0) throw new IllegalArgumentException("level harus >= 0");
        if (strategy == null) throw new IllegalArgumentException("strategy tidak boleh null");
        this.level = level;
        this.strategy = strategy;
    }

    public int getLevel() { return level; }

    public void addSkill(Skill s) {
        if (s != null) skills.add(s);
    }

    public void heal(int amount) {
        int before = getHealth();
        setHealth(Math.min(getMaxHealth(), getHealth() + amount));
        System.out.println("[Team A] " + getName() + " healed: " + before + " -> " + getHealth());
    }

    @Override
    public void attack(Character target) {
        if (target == null || !target.isAlive()) return;
        // pilih skill PiercingStrike secara acak jika tersedia, atau normal attack
        Skill chosen = null;
        List<Skill> piercing = new ArrayList<>();
        for (Skill s : skills) if (s instanceof PiercingStrike) piercing.add(s);
        Random r = new Random();

        if (!piercing.isEmpty()) {
            // 50% pakai Piercing jika ada
            if (r.nextBoolean()) chosen = piercing.get(r.nextInt(piercing.size()));
        }
        if (chosen == null) {
            // kadang gunakan HealSkill if low hp
            if (getHealth() <= (getMaxHealth() / 2)) {
                for (Skill s : skills) if (s instanceof HealSkill) { chosen = s; break; }
            }
        }

        if (chosen != null) {
            chosen.apply(this, target);
        } else {
            int dmg = strategy.computeDamage(this, target);
            System.out.println("[Team A] " + getName() + " -> " + target.getName() + " (Normal Strategy): " + dmg);
            target.takeDamage(dmg);
        }
    }
}
