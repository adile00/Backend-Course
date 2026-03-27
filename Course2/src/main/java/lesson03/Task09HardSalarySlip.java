package lesson03;

import java.math.BigDecimal;

public class Task09HardSalarySlip {
    public static final BigDecimal TAX = new BigDecimal("0.20");
    public static final BigDecimal PENSION = new BigDecimal("0.05");

    public static void main(String[] args) {
        BigDecimal BaseSalary = new BigDecimal("1000.00");
        BigDecimal overtimeHours = new BigDecimal("10");
        BigDecimal overtimeRate = new BigDecimal("15.00");
        BigDecimal bonus = new BigDecimal("200.00");

        // Calculate gross salary
        BigDecimal grossSalary = BaseSalary.add(overtimeHours.multiply(overtimeRate)).add(bonus);
        // Calculate tax and pension amounts
        BigDecimal taxAmount = grossSalary.multiply(TAX);
        BigDecimal pensionAmount = grossSalary.multiply(PENSION);
        // Calculate net salary
        BigDecimal netSalary = grossSalary.subtract(taxAmount).subtract(pensionAmount);

        // Print the salary slip
        System.out.printf(" Gross Salary: $%.2f%n Tax Amount: $%.2f%n Pension Amount: $%.2f%n Net Salary: $%.2f%n ",
                grossSalary,taxAmount, pensionAmount, netSalary);

    }
}
