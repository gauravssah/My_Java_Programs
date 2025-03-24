import java.util.Scanner;

public class TicketDiscount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hey, Welcome to Ticket Booking Services!");

        System.out.print("Please Enter Your Age: ");
        int age = input.nextInt();

        System.out.print("Are you a female? (true/false): ");
        boolean isFemale = input.nextBoolean();

        if (age < 5) {
            System.out.println("You Will get 75% Discount");
        } else if (isFemale) {
            System.out.println("You Will get 55% Discount");

        } else if (age > 60 && !isFemale) {
            System.out.println("You Will get 25% Discount");

        } else {
            System.out.println("You Will get 0% Discount");

        }

        input.close();
    }
}