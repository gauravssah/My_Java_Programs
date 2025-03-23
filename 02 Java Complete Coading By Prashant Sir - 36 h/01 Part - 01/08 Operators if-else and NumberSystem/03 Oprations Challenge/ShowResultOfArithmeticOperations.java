import java.util.Scanner;

public class ShowResultOfArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The first Number: ");
        int a = input.nextInt();
        System.out.print("Enter The second Number: ");
        int b = input.nextInt();
        input.close();

        System.out.println(a + "+" + b + " = " + (a + b));
        System.out.println(a + "-" + b + " = " + (a - b));
        System.out.println(a + "*" + b + " = " + (a * b));
        System.out.println(a + "/" + b + " = " + (a / b));
        System.out.println(a + "%" + b + " = " + (a % b));

    }
}
