
/**
 * Write a description of class PirateShip here.
 * 
 * @author (Mondol, Sajib Joseph) 
 * @version (a version number or a date)
 */
public class PirateShip {
    private String name;
    private ImprovedPirate captain;
    private ImprovedPirate[] crew;
    private int crewmates;

    public PirateShip(String name, ImprovedPirate captain) {
        this.name = name;
        this.captain = captain;
        this.crew = new ImprovedPirate[10];
        this.crewmates = 0;
    }

    public int getNumPirateCrew() {
        return crewmates;
    }

    public void addPirate(ImprovedPirate pirate) {
        if (crewmates == crew.length) {
            // Create a new array that's twice as large
            ImprovedPirate[] newCrew = new ImprovedPirate[crew.length * 2];

            // Copy the existing pirates into the new array
            for (int i = 0; i < crew.length; i++) {
                newCrew[i] = crew[i];
            }

            // Replace the old array with the new one
            crew = newCrew;
        }
        crew[crewmates] = pirate;
        crewmates++;
    }

    public void removePirate() {
        if (crewmates > 0) {
            crew[crewmates - 1] = null;
            crewmates--;
        }
    }

    public String toString() {
        String result = "Ship " + name + " with captain " + captain.toString() + "\n";
        for (int i = 0; i < crewmates; i++) {
            result += crew[i].toString() + "\n";
        }
        return result;
    }
}
