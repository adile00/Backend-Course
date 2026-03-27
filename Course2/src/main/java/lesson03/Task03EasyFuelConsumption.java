package lesson03;

public class Task03EasyFuelConsumption {
    public static void main(String[] args) {
        double pricePerLiter = 1.7;
        int distanceKm = 120;
        double fuelLiters= 3.2;

        double litersPer100Km = (fuelLiters / distanceKm) * 100;

        double estimatedTripCost = pricePerLiter * fuelLiters;

        // Print results
        System.out.println("Distance (km): " + distanceKm);
        System.out.println("Fuel Used (liters): " + fuelLiters);
        System.out.println("Fuel Consumption (liters/100km): " + litersPer100Km);
        System.out.println("Price per Liter: " + pricePerLiter);
        System.out.println("Estimated Trip Cost: " + estimatedTripCost);

    }
}
