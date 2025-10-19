package UTS.game;

import java.util.Random;

public class PiercingStrike implements Skill {
    private final double multiplier;
    private final Random rand = new Random();

    public PiercingStrike(double multiplier) { this.multiplier = multiplier; }

    @Override
    public String name() { return "PiercingStrike(x" + multiplier + ")"; }

    @Override
    public void apply(Character self, Character target) {
        if (self == null || target == null) return;
        int base = (int) Math.round(self.getAttackPower() * multiplier);
        // aktifkan flag agar onIncomingDamage mengabaikan 25% reduction sekali
        target.setIgnoreReductionOnce(true);
        System.out.println("[Team A] " + self.getName() + " -> " + target.getName() + " (PiercingStrike): " + base);
        target.takeDamage(base);
    }
}
