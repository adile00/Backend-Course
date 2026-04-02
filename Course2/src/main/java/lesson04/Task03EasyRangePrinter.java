package lesson04;

import java.util.Scanner;

public class Task03EasyRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();

        System.out.print("Enter end: ");
        int end = scanner.nextInt();

        // If start > end, swap values using an if block.
        if ( start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // Running sum
        int sum = 0;

        System.out.println("Numbers in range:");
        for (int i = start; i <= end; i++) {
            System.out.println("Number: " + i);
            sum += i;

            // Numbers divisible by 3
            if (i % 3 == 0) {
                System.out.printf("%d is divisible by 3 %n", i);
            }
        }
        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
