package lesson03;

public class Task01EasyEmployeeBadge {
    public static void main(String[] args) {

        // Constant
        final String COMPANY_NAME = "TechCorp";

        // Employee variables
        String name = "Adelya";
        int age = 20;
        String department = "IT";
        int yearsAtCompany = 2;
        boolean isActive = true;
        double hourlyRate = 15.50;

        // Increase hourly rate
        hourlyRate += 2.0;

        // Print formatted badge
        System.out.printf(
                "Company: %s | Name: %s | Age: %d | Dept: %s | Years: %d | Active: %b | Rate: %.2f%n",
                COMPANY_NAME, name, age, department, yearsAtCompany, isActive, hourlyRate
        );
    }
}
