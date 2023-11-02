
public class Test1
{

    public static void main(String[] args)
    {
        // This code shows how we will use the Pirate class
        // You need to implement the constructors, fields, and methods used 
        //     below in order to make the code compile
        Pirate p1 = new Pirate("Long John Silver", 10, 5);
        Pirate p2 = new Pirate("Purplebeard, Scourge of the Midwest Conference", 4, 10);
        
        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            p1.attack(p2);
            p2.attack(p1);
        }
        
        System.out.println("So much death! After a vicious fight,");
        System.out.println("Pirate #1: "+p1.toString());
        System.out.println("Pirate #2: "+p2.toString());

    }

}
