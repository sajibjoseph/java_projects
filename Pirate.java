import java.util.Random;
/**
 * Write a description of class Pirate here.
 * 
 * @author (Mondol, Sajib Joseph) 
 * @version (a version number or a date)
 */
public class Pirate
{
    private String name;
    private int health;
    private int doubloons;

    public Pirate(String name, int health, int doubloons){ 
        this.name= name;
        this.health= health;
        this.doubloons= doubloons;
    }

    public void setHealth(int health){
        this.health= health;
    }

    public void setDoubloons(int doubloons){
        this.doubloons = doubloons;
    }

    public void attack(Pirate other) {
        if (this.health > 0 && other.health > 0) {
            Random random = new Random();
            int damage = random.nextInt(10-5)+1;
            other.health -= damage;
        }
    }

    public int getHealth() {
        return health;
    }

    public int getDoubloons(int doubloons){
        return doubloons;
    }

    public String toString() {
        if (health <= 0) {
            return name + " is dead";
        } else {
            return name + " has health " + health + " and " + (doubloons+doubloons) + " doubloons";
        }
    }

}
