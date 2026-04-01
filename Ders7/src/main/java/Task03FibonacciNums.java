public class Task03FibonacciNums {
    public static void main(String[] args) {
        int n = 12;
        int[] fib = new int[n];
        fib[0] = 1; // First Fibonacci number
        fib[1] = 1; // Second Fibonacci number

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Each number is the sum of the two preceding ones
        }

        // Print the Fibonacci numbers
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
