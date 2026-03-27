package lesson03;

public class Task02EasyCartTotals {
    public static void main(String[] args) {
        int quantityFirst = 1;
        int quantitySecond = 1;
        int quantityThird = 1;
        double priceFirst = 50;
        double priceSecond = 10;
        double priceThird = 10;

        int quantityTotal;
        double priceTotal;

// Calculate subtotal using arithmetic operators.
        quantityTotal = (quantityFirst+quantitySecond+quantityThird)/3;
        priceTotal = priceFirst*quantityFirst+priceSecond*quantitySecond+priceThird*quantityThird;

        System.out.printf("The total quantity of 3 products is : %d %n",quantityTotal);
        System.out.printf("The total price of 3 products is : %.2f %n",priceTotal);

// Add delivery fee and platform fee.
        double deliveryFee = 2.5;
        double platformFee = 0.9;

// Apply a fixed coupon discount using -= operator.
        final double discount = 10; // example : 10azn
        priceTotal -= discount;

// Print subtotal, fees, discount, and final total (2 decimal places).
        System.out.printf("Subtotal: %d, Fees: %.2f, Discount: %.2f, Final Total: %.2f ",
                quantityTotal,deliveryFee+platformFee, discount, priceTotal);

    }
}
