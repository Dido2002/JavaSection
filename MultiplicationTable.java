import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = console.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println("Result = " + number * i);
        }
    }
}
