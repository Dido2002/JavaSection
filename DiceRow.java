import java.util.Random;

public class DiceRow {

    public static void main(String[] args){

        Random rndNumber = new Random();
        int x = rndNumber.nextInt(6) + 1;


        System.out.println("You rolled a: " + x);
    }
}
