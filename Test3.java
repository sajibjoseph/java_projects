
public class Test3
{


    public static void main(String[] args)
    {
        // Once you finish the ImprovedPirate and Weapon
        // classes, this class should compile and run
        ImprovedPirate p1 = new ImprovedPirate("Long John Silver", 10, 10);
        ImprovedPirate p2 = new ImprovedPirate("Purplebeard, Scourge of the Midwest Conference", 10, 10);
        
        Weapon w1=new Weapon("katana", 3, 6);
        Weapon w2=new Weapon("butter knife", 1, 2);
        
        p1.setWeapon(w1);
        p2.setWeapon(w2);
        
        while (p1.getHealth() > 0 && p2.getHealth() > 0){
            p1.attack(p2);
            if (p2.getHealth()>0){
                // p2 can only fight back if they are not dead
                p2.attack(p1);
            }
        }
        
        System.out.println("So much death! After a vicious fight,");
        System.out.println("Pirate #1: "+p1.toString());
        System.out.println("Pirate #2: "+p2.toString());

    }

}
