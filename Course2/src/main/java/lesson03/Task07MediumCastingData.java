package lesson03;

public class Task07MediumCastingData {
    public static void main(String[] args) {
        // Casting double to int
        double a = 127.85;
        int b = (int) a;
        System.out.println("Double value: " + a);
        System.out.println("Casted to int: " + b);

        // Casting int to byte
        int c = 130;
        byte d = (byte) c;
        System.out.println("Int value: " + c);
        System.out.println("Casted to byte: " + d);

        // Adding two byte values
        byte sensor1 = 100;
        byte sensor2 = 30;
        int sum = sensor1 + sensor2; // This will be promoted to int
        byte sumByte = (byte) sum; // Casting back to byte, may cause overflow
        System.out.println("Sensor 1: " + sensor1);
        System.out.println("Sensor 2: " + sensor2);
        System.out.println("Sum of sensors (int): " + sum);
        System.out.println("Sum of sensors (byte): " + sumByte);



    }
}
