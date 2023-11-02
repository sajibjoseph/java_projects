import java.util.Random;
/**
 * Write a description of class Pirate here.
 * 
 * @author (Mondol, Sajib Joseph) 
 * @version (a version number or a date)
 */
public class ImprovedPirate
{
    private String name;
    private int health;
    private int doubloons;
    private Weapon weapon;

    public ImprovedPirate(String name, int health, int doubloons){ 
        this.name= name;
        this.health= health;
        this.doubloons= doubloons;
        this.weapon = weapon;
    }

    public void setHealth(int health){
        this.health= health;
    }

    public void setDoubloons(int doubloons){
        this.doubloons = doubloons;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(ImprovedPirate other) {
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
            String weaponString;
            if (weapon != null) {
                weaponString = " with " + weapon.toString();
            } else {
                weaponString = "";
            }
            return name + " has health " + health + " and " + (doubloons+doubloons) + " doubloons" + weaponString;
        }
    }

}
