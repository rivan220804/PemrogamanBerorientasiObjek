public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Rayvenss", 120, 20, 5); 
        Character m1 = new Monster("Goblin", 80, 10, "Goblin");
        Character boss = new BossMonster("Dragon King", 200, 30, "Dragon");

        Character[] enemies = {m1, boss};

        for (Character enemy : enemies) {
            System.out.println("\n=== Battle: " + p1.getName() + " vs " + enemy.getName() + " ===");
            while (p1.isAlive() && enemy.isAlive()) {
                p1.attack(enemy);
                if (enemy.isAlive()) {
                    enemy.attack(p1);
                }
                if (Math.random() < 0.3) {
                    p1.heal();
                }
            }
            if (!p1.isAlive()) {
                System.out.println(p1.getName() + " has been defeated!");
                break;
            } else {
                System.out.println(enemy.getName() + " has been defeated!");
            }
        }
    }
}

