import java.util.Random;

/**
 * Write a description of class LIttleDebbie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LittleDebbie
{
    //--------------------fields--------------------
    private static String[] fillings = new String[]{"Strawberry", "Birthday Cake", "Peanut Butter", "Cream", "Chocolate"};

    private String filling;

    //--------------------constuctors--------------------
    public LittleDebbie(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(fillings.length);
        this.filling = fillings[randomIndex];
    }

    public LittleDebbie(String filling){
        if (legitFilling(filling))
            this.filling = filling;
        else 
            this.filling = fillings[0];
    }
    //--------------------methods--------------------
    public boolean legitFilling(String filling){
        for (int f=0; f<fillings.length; f++){
            if (filling.equals(fillings[f]))
                return true;
        }
        return false;
    }

    public String getFilling(){
        return this.filling;
    }

    public boolean equals(Object other){
        if (other instanceof LittleDebbie){
            return this.filling.equals(((LittleDebbie)other).filling);
        }
        return false;

    }

}