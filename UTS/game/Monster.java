package UTS.game;

import java.util.Random;

public class Monster extends Enemy {
    private final Random rand = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        if (target == null || !target.isAlive()) return;
        int base = strategy.computeDamage(this, target);
        int dmg = base + (rand.nextInt(5) - 2);
        if (dmg < 0) dmg = 0;
        System.out.println("[Team B] " + getName() + " -> " + target.getName() + " (Normal " + dmg + "):");
        target.takeDamage(dmg);
    }
}
