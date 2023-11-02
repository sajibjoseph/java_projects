
public class Test2
{

    public static void main(String[] args)
    {
        // This code shows how we will use the Weapon class
        // Once you finish writing the weapon class, this
        // class should compile and run.
        Weapon w1=new Weapon("harsh language", 1, 3);
        Weapon w2=new Weapon("global warming, which will kill us all", 1, 100);
        
        System.out.println(w1.toString());
        for (int i=0; i<5; i++){
            System.out.println(w1.getDamage());
        }
        
        System.out.println(w2.toString());
        for (int i=0; i<5; i++){
            System.out.println(w2.getDamage());
        }
        

    }

}
