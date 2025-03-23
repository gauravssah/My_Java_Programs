import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input_Hai = new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String name = input_Hai.nextLine();

        System.out.println("Good Morning, " + name);

        System.out.println("Can you please enter your Number: ");
        long num = input_Hai.nextLong(); // Changed from int to long

        System.out.println("Enter Your age: ");
        int age = input_Hai.nextInt();

        System.out.println("Hello, " + name + "\nYour Mob- " + num + "\nand Age is: " + age);

        input_Hai.close(); // Closing scanner to prevent resource leaks
    }
}
