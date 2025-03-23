import java.util.Scanner;

public class ProductOfFloatingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The first Number: ");
        float a = input.nextFloat();
        System.out.print("Enter The second Number: ");
        float b = input.nextFloat();
        input.close();

        System.out.println("Product of : " + a + "*" + b + " = " + (a * b));
    }
}
