package lesson04;

import java.util.Scanner;

public class Task02EasyDayTypeSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-7) from console: ");
        int dayNum = scanner.nextInt();

        // switch expression to map number to day name
        switch (dayNum) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }

        // second decision block to print Weekday or Weekend.
        if (dayNum >= 1 && dayNum <= 5) {
            System.out.println("It's a Weekday.");
        } else if (dayNum == 6 || dayNum == 7) {
            System.out.println("It's a Weekend.");
        }

        scanner.close();
    }
}
