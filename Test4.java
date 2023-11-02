
public class Test4
{

    public static void main(String[] args)
    {
        // This relies on PirateShip and ImprovedPirate
        ImprovedPirate captain=new ImprovedPirate("Mal", 10, 5);
        
        PirateShip ship=new PirateShip("Serenity", captain);
        
        ship.addPirate(new ImprovedPirate("Zoe", 10, 6));
        ship.addPirate(new ImprovedPirate("Wash", 12, 3));
        ship.addPirate(new ImprovedPirate("Shepherd", 9, 4));
        ship.addPirate(new ImprovedPirate("Inara", 9, 4));
        ship.addPirate(new ImprovedPirate("Jayne", 20, 1));
        ship.addPirate(new ImprovedPirate("Kaylee", 10, 1));
        ship.addPirate(new ImprovedPirate("Simon", 11, 3));
        ship.addPirate(new ImprovedPirate("River", 8, 3));
        
        System.out.println(ship.toString());

    }

}
