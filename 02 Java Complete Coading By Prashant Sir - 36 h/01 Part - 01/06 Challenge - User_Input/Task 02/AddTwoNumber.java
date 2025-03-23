import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number: ");
        int num2 = input.nextInt();

        System.out.println("The Sum of " + num1 + "and " + num2 + " is : " + (num1 + num2));

        input.close();
    }
}
