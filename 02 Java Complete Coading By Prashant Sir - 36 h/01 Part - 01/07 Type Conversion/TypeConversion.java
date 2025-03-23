public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5; // Implicit Conversion (int data in float)
        System.out.println(myFloat); // 5.0

        long big = 45; // Implicit Conversion
        System.out.println(big);

        int myInt = (int) 5.45f;
        System.out.println(myInt); // 5 (Data Loss) Explicit Conversion
    }
}
