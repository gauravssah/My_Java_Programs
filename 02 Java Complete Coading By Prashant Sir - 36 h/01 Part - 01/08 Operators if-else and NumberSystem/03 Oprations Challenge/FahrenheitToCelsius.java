import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("To convert Fahrenheit to Celsius:");

        // Taking Fahrenheit input
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converting to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Displaying the result
        System.out.println("Temperature in Celsius: " + celsius);

        input.close();
    }
}
