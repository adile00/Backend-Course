public class Task02MinMaxValOfArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 10, 15};

        int min = arr[0];
        int max = arr[0];

        // Loop through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print results
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}