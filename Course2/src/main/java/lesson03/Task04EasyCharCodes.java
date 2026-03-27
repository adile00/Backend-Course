package lesson03;

public class Task04EasyCharCodes {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = '7';
        char c3 = '-';
        char c4 = '#';

        //Print integer (Unicode/ASCII) codes
        System.out.printf("Char : %c -> code %d%n", c1,(int)c1);
        System.out.printf("Char : %c -> code %d%n", c2,(int)c2);
        System.out.printf("Char : %c -> code %d%n", c3,(int)c3);
        System.out.printf("Char : %c -> code %d%n", c4,(int)c4);

        String text = "A\uD83D\uDE00";

        // Print length vs codePointCount
        System.out.println("String: " + text);
        System.out.println("length: " + text.length());
        System.out.println("codePointCount(): " + text.codePointCount(0, text.length()));


    }
}
