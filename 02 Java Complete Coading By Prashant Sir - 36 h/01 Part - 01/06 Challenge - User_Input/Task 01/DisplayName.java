import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner inputDat = new Scanner(System.in);

        System.out.print("Hey, How Are you, May i Know Your Name: ");
        String UserName = inputDat.nextLine();

        System.out.println("Hey " + UserName + " Welcome To This Java Learning.");
        inputDat.close();
    }
}
