package lesson03;

import java.math.BigDecimal;

public class Task05MediumInvoicePrecision {
    public static void main(String[] args) {


        double a = 19.99;
        double b = 5.75;
        double c = 2.40;

        // Total
        double total = a + b + c;
        System.out.println("Double total: " + total);

        // Using BigDecimal string constructors
        BigDecimal BigA = new BigDecimal("19.99");
        BigDecimal BigB = new BigDecimal("5.75");
        BigDecimal BigC = new BigDecimal("2.40");

        // BigDecimal total
        BigDecimal BigTotal = BigA.add(BigB).add(BigC);
        System.out.println("BigDecimal total: " + BigTotal);

        // Difference
        BigDecimal df = BigTotal.subtract(BigDecimal.valueOf(total));
        System.out.println("Difference: " + df);

    }
}

