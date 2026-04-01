public class Task11HardSensorPacket {
    public static void main(String[] args) {

        int temperature = 45; // 0–63 → needs 6 bits
        int humidity = 100;   // 0–127 → needs 7 bits
        int battery = 10;     // 0–15 → needs 4 bits

        // Pack values into one int
        int packed = (temperature << 11) | (humidity << 4) | battery;

        // Print packed data
        System.out.println("Original Temperature: " + temperature);
        System.out.println("Original Humidity: " + humidity);
        System.out.println("Original Battery: " + battery);

        System.out.println("\nPacked Value: " + packed);
        System.out.println("Packed Binary: " + Integer.toBinaryString(packed));

        // Unpack values
        int unpackedTemperature = (packed >> 11) & 0b111111;   // 6 bits
        int unpackedHumidity = (packed >> 4) & 0b1111111;      // 7 bits
        int unpackedBattery = packed & 0b1111;                 // 4 bits

        // Print unpacked values
        System.out.println("\nUnpacked Temperature: " + unpackedTemperature);
        System.out.println("Unpacked Humidity: " + unpackedHumidity);
        System.out.println("Unpacked Battery: " + unpackedBattery);
    }
}