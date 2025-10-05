public class Player extends Character {
    private int level;

    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
    }

    @Override
    public void attack(Character target) {
        int damage = getAttackPower() + level;
        System.out.println(getName() + " attacks with sword! Damage: " + damage);
        target.takeDamage(damage);
    }

    public void heal() {
        int healAmount = 20;
        setHealth(getHealth() + healAmount);
        System.out.println(getName() + " heals for " + healAmount + " points! Current health: " + getHealth());
    }
}
