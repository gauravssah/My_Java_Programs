public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("Before Swaping:");

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b; // 5 + 7 = 12
        b = a - b; // 12 - 7 = 5
        a = a - b;

        System.out.println("After Swaping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
