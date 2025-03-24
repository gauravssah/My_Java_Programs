import java.util.Scanner;

public class CheckingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ckecking Positive, Negative or Zero Number.");

        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("The Number is Negative.");
        } else if (num > 0) {
            System.out.println("The Number is Positive.");
        } else {
            System.out.println("The Number is Zero.");
        }

        input.close();

    }
}
