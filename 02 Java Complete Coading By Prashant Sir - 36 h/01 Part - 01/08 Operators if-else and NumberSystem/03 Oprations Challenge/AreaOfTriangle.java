import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To calculate the Area of Triangle, ");
        System.out.print("Enter the value of B: ");
        float b = input.nextFloat();
        System.out.print("Enter the value of H: ");
        float h = input.nextFloat();

        // Correct formula using 0.5
        // System.out.println("The Area of Triangle is : " + (0.5 * b * h));
        System.out.println("The Area of Triangle is : " + ((float) 1 / 2 * (b * h)));

        input.close();
    }
}
