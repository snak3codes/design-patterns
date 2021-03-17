package Factory;

public abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double newDamage) {
        this.amtDamage = newDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the Hero ship.");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen.");
    }

    public void shoot() {
        System.out.println(getName() + " attacks and does " + getAmtDamage() + " damage to the Hero ship.");
    }
}
