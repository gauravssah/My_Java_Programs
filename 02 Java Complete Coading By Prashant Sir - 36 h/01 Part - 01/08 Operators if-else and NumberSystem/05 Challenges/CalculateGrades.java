import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        input.close();
    }
}
