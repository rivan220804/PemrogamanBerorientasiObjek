package UTS.game;

import java.util.*;

public class GameTest {
    public static void main(String[] args) {
        Player p = new Player("Rayvenss", 120, 25, 5, new LevelScaledStrategy(2));
        p.addSkill(new HealSkill(15));
        p.addSkill(new PiercingStrike(1.2));
        p.addEffect(new Shield(10, 3));
        p.addEffect(new Regen(8, 4));

        BossMonster DragonKing = new BossMonster("DragonKing", 150, 28, 5, new FixedStrategy());
        Monster goblin = new Monster("Goblin", 80, 12, 2, new FixedStrategy());

        List<Character> teamA = Arrays.asList(p);
        List<Character> teamB = Arrays.asList(DragonKing, goblin);

        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}
