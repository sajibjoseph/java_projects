import java.util.Random;
/**
 * Write a description of class Weapon here.
 * 
 * @author (Mondol, Sajib Joseph) 
 * @version (a version number or a date)
 */
public class Weapon
{
    private String name;
    private int minDamage;
    private int maxDamage;

    public Weapon(String name, int minDamage, int maxDamage){ 
        this.name= name;
        this.minDamage= minDamage;
        this.maxDamage= maxDamage;
    }

    public void setminDamage(int minDamage){
        this.minDamage= minDamage;
    }

    public void setmaxDamage(int maxDamage){
        this.maxDamage = maxDamage;
    }

    public String toString() {
        return name + ", damage is " + minDamage + " to " + maxDamage;
    }

    public int getDamage() {
        Random random = new Random();
        return random.nextInt(maxDamage - minDamage + 1) + minDamage;
    }

}
