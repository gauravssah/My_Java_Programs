import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To Calculate The Perimeter of Rectangle.");

        System.out.print("Enter the value of A: ");
        float A = input.nextFloat();

        System.out.print("Enter the value of B: ");
        float B = input.nextFloat();

        System.out.print("Enter the value of C: ");
        float C = input.nextFloat();

        System.out.print("Enter the value of D: ");
        float D = input.nextFloat();

        input.close();

        System.out.println("Perimeter Of Rectangle : " + (A + B + C + D));
    }
}
