package UTS.game;

public class Shield implements StatusEffect {
    private final int flatReduce;
    private int remaining;

    public Shield(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.remaining = duration;
    }

    public int getFlatReduce() { return flatReduce; }

    @Override
    public void onTurnStart(Character self) {
        System.out.println("[Start Effects] " + self.getName() + " Shield(active, " + remaining + ")");
    }

    @Override
    public void onTurnEnd(Character self) {
        remaining--;
        if (remaining > 0) {
            System.out.println("[End Effects] " + self.getName() + " Shield remaining: " + remaining + " turns");
        } else {
            System.out.println("[End Effects] " + self.getName() + " Shield EXPIRES");
        }
    }

    @Override
    public boolean isExpired() { return remaining <= 0; }
}
