package UTS.game;

public class Regen implements StatusEffect {
    private final int perTurn;
    private int remaining;

    public Regen(int perTurn, int duration) {
        this.perTurn = perTurn;
        this.remaining = duration;
    }

    @Override
    public void onTurnStart(Character self) { }

    @Override
    public void onTurnEnd(Character self) {
        if (remaining <= 0) return;
        // hanya player di contoh, tapi bisa untuk siapa saja
        int before = self.getHealth();
        self.setHealth(Math.min(self.getMaxHealth(), self.getHealth() + perTurn));
        System.out.println("[End Effects] " + self.getName() + " Regen: +" + perTurn + " HP => " + self.getHealth());
        remaining--;
    }

    @Override
    public boolean isExpired() { return remaining <= 0; }
}
