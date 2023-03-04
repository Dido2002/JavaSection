import java.util.Scanner;
public class Main{
    public static void main(String []args){

        System.out.println("Enter a month");
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();

        int days = 0;

        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December" -> days = 31;
            case "April", "June", "September", "November" -> days = 31;
            case "February" -> days = 28;
            default -> {
                System.out.println("You have a wrong input!");
                return;
            }
        }
        System.out.println("This month - " + month + " has " + days +" days ");


    }

}

