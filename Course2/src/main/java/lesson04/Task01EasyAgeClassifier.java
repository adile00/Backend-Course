package lesson04;

import java.util.Scanner;

public class Task01EasyAgeClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;

        // Prompt the user to enter their age
        System.out.print("Input age: ");
        age = input.nextInt();


        // Classify the age and print the corresponding category using if/else statement
        if (age == 0 ) {
            System.out.println("Invalid input");
        } else if (age >= 0 && age <= 12) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid age entered.");
        }

        input.close();
    }
}
