package UTS.game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (target == null || !target.isAlive()) return;
        turnCounter++;
        int base = strategy.computeDamage(this, target);
        boolean rage = (getHealth() < (getMaxHealth() / 2)) || (turnCounter % 3 == 0);
        int dmg = rage ? base * 2 : base;
        System.out.println("[Team B] " + getName() + " -> " + target.getName() + (rage ? " (RAGE x2: " : " (Normal: ") + dmg + "):");
        target.takeDamage(dmg);
    }
}
