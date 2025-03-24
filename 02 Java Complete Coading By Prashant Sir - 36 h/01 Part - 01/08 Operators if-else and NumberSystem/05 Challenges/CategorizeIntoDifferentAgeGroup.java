import java.util.Scanner;

public class CategorizeIntoDifferentAgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 0 && age <= 12) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20 && age <= 59) {
            System.out.println("You are an Adult.");
        } else if (age >= 60 && age <=150) {
            System.out.println("You are a Senior.");
        } else {
            System.out.println("Invalid age entered.");
        }

        input.close();
    }
}
