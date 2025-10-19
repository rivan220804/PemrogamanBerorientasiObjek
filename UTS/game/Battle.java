package UTS.game;

import java.util.*;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;
    private int turn = 1;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    public void run() {
        printSetup();

        while (hasAlive(teamA) && hasAlive(teamB)) {
            System.out.println("\n=== TURN " + turn + " ===");

            for (Character p : new ArrayList<>(teamA)) {
                if (!p.isAlive()) continue;
                Character target = selectTargetForPlayer();
                p.performTurn(target);
            }

            for (Character e : new ArrayList<>(teamB)) {
                if (!e.isAlive()) continue;
                Character target = selectTargetForEnemy();
                e.performTurn(target);
            }
            turn++;
        }

        System.out.println("\n=== RESULT ===");
        if (hasAlive(teamA)) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Team B menang!");
        }

        printSummary();
    }

    private boolean hasAlive(List<Character> list) {
        for (Character c : list) if (c.isAlive()) return true;
        return false;
    }

    private Character selectTargetForPlayer() {
        Character best = null;
        for (Character c : teamB) {
            if (!c.isAlive()) continue;
            if (!(c instanceof Enemy)) continue;
            Enemy e = (Enemy) c;
            if (best == null) best = c;
            else {
                Enemy be = (Enemy) best;
                if (e.getThreatLevel() > be.getThreatLevel()) best = c;
                else if (e.getThreatLevel() == be.getThreatLevel() && c.getHealth() < best.getHealth()) best = c;
            }
        }
        return best;
    }

    private Character selectTargetForEnemy() {
       
        Character best = null;
        for (Character c : teamA) {
            if (!c.isAlive()) continue;
            if (best == null) best = c;
            else if (c.getHealth() > best.getHealth()) best = c;
        }
        return best;
    }

    private void printSetup() {
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        for (Character c : teamA) {
            if (c instanceof Player) {
                Player p = (Player) c;
                System.out.println("  - Player(name=" + p.getName() + ", HP=" + p.getHealth() + "/" + p.getMaxHealth()
                        + ", AP=" + p.getAttackPower() + ", Lv=" + p.getLevel() + ")");
            } else {
                System.out.println("  - " + c.getName());
            }
        }
        System.out.println("Team B:");
        for (Character c : teamB) {
            if (c instanceof BossMonster)
                System.out.println("  - BossMonster(name=" + c.getName() + ", HP=" + c.getHealth() + "/" + c.getMaxHealth() + ")");
            else if (c instanceof Monster)
                System.out.println("  - Monster(name=" + c.getName() + ", HP=" + c.getHealth() + "/" + c.getMaxHealth() + ")");
            else
                System.out.println("  - " + c.getName());
        }
    }

    private void printSummary() {
        System.out.println("Sisa HP:");
        for (Character c : teamA) System.out.println("  - " + c.getName() + ": " + c.getHealth() + "/" + c.getMaxHealth());
        for (Character c : teamB) System.out.println("  - " + c.getName() + ": " + c.getHealth() + "/" + c.getMaxHealth());
    }
}
