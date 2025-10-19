package UTS.game;

public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) { this.bonusPerLevel = bonusPerLevel; }

    @Override
    public int computeDamage(Character self, Character target) {
        if (self instanceof Player) {
            Player p = (Player) self;
            return self.getAttackPower() + p.getLevel() * bonusPerLevel;
        }
        return self.getAttackPower();
    }
}
