import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To calculate the Compound Interest.");

        System.out.print("Enter the value of P: ");
        double p = input.nextDouble();

        System.out.print("Enter the value of T: ");
        double t = input.nextDouble();

        System.out.print("Enter the value of R: ");
        double r = input.nextDouble();

        // Correct Compound Interest formula
        double a = p * Math.pow((1 + r / 100), t);
        double ci = a - p;

        System.out.println("The Compound Interest is: " + ci);
        System.out.println("The Final Amount (A) is: " + a);

        input.close();
    }
}
