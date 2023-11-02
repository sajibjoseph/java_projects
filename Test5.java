
/**
 * Write a description of class Test5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test5
{
    public static void main(String[] args)
    {
        ImprovedPirate captain=new ImprovedPirate("Mal", 10, 5);
        
        PirateShip ship=new PirateShip("Serenity", captain);
        
        // we are going to add the same ImprovedPirate in a loop
        // to make sure that we are able to expand the capacity
        // of our PirateShip.
        //
        // Note that simply changing the constructor so that the 
        // initial capacity is a million DOES NOT GET YOU CREDIT FOR
        // THIS PART OF THE LAB. You must start with a reasonable
        // size array (8 or 16 or something like that) and then resize
        // when you get too big.
        System.out.println("size of crew should be 0, it is " + ship.getNumPirateCrew());
        
        ImprovedPirate p = new ImprovedPirate("Zoe", 10, 6);

        for (int i=0; i<10; i++) {
            ship.addPirate(p);
        }
        System.out.println("size of crew should be 10, it is " + ship.getNumPirateCrew());
        
        ship.removePirate();
        ship.removePirate();
        
        System.out.println("size of crew should be 8, it is " + ship.getNumPirateCrew());
        
        for (int i=0; i<12; i++) {
            ship.addPirate(p);
        }
        
        System.out.println("size of crew should be 20, it is " + ship.getNumPirateCrew());

    }
}
