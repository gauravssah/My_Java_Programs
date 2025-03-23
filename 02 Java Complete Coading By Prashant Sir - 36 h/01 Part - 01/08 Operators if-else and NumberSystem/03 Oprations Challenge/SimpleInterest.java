import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To Calculate Simple Interest.");
        System.out.print("Enter the value of P: ");
        float p = input.nextFloat();

        System.out.print("Enter the value of T: ");
        float t = input.nextFloat();

        System.out.print("Enter the value of R: ");
        float r = input.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("The SImple Interest is : " + si);

        input.close();
    }
}
