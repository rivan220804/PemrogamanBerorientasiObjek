package UTS.game;

public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) { this.amount = amount; }

    @Override
    public String name() { return "HealSkill(+" + amount + ")"; }

    @Override
    public void apply(Character self, Character target) {
        if (self == null) return;
        if (!(self instanceof Player)) return;
        Player p = (Player) self;
        int before = p.getHealth();
        int toHeal = amount;
        p.setHealth(Math.min(p.getMaxHealth(), p.getHealth() + toHeal));
        System.out.println("[Team A] Player uses " + name() + ": " + before + " -> " + p.getHealth());
    }
}
