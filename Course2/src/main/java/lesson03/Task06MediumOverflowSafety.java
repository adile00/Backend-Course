package lesson03;

public class Task06MediumOverflowSafety {
    public static void main(String[] args) {
        int packageCounter = Integer.MAX_VALUE - 2;

        // Overflow
        System.out.println("Initial value: " + packageCounter++);
        System.out.println("First addition: " + packageCounter++);
        System.out.println("Second addition: " + packageCounter++);
        System.out.println("Third addition: " + packageCounter++);
        System.out.printf("%n");

        // Using Math.addExact
        // packageCounter = Integer.MAX_VALUE - 2;
       //  for (int i = 0; i < 4; i++) {
            // packageCounter = Math.addExact(packageCounter, i);
            //   System.out.println("After addition: " + packageCounter);
       // }

        // Math.addExact will throw an ArithmeticException when an overflow occurs,
        // allowing us to handle it gracefully instead of silently wrapping around.
        // That is why let use it with try-catch block:

        packageCounter = Integer.MAX_VALUE - 2;
        try {
            for (int i = 0; i < 4; i++) {
                packageCounter = Math.addExact(packageCounter, i);
                System.out.println("After addition: " + packageCounter);
            }
        } catch (ArithmeticException e) {
            System.out.println("Overflow detected: " + e.getMessage());
        }
    }
}
