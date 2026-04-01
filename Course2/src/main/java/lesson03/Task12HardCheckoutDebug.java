package lesson03;

public class Task12HardCheckoutDebug {
    public static void main(String[] args) {

        // Buggy version
        int price = 100;
        int discount = 15;

        int finalPrice = price - (price * discount / 100); // integer division
        System.out.println("Buggy final price: " + finalPrice);

        String a = new String("test");
        String b = new String("test");

        if (a == b) {
            System.out.println("Buggy string compare: equal");
        } else {
            System.out.println("Buggy string compare: not equal");
        }

        int large1 = Integer.MAX_VALUE;
        int large2 = 1;
        int sum = large1 + large2;
        System.out.println("Buggy sum: " + sum);

        System.out.println("---- Fixed Version ----");

        // Fix 1: use double casting
        double fixedPrice = price - (price * (double) discount / 100);
        System.out.println("Fixed final price: " + fixedPrice);

        // Fix 2: use equals()
        if (a.equals(b)) {
            System.out.println("Fixed string compare: equal");
        }

        // Fix 3: safe addition
        try {
            int safeSum = Math.addExact(large1, large2);
            System.out.println("Safe sum: " + safeSum);
        } catch (ArithmeticException e) {
            System.out.println("Overflow detected in safe sum");
        }
    }
}
