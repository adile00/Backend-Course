package lesson03;
import java.nio.charset.StandardCharsets;

public class Task10HardEncodingCheck {
    public static void main(String[] args) {
        String title = "Café Bakı \uD83D\uDE00";

        // Converting to bytes using UTF-8 encoding
        byte[] utf8Bytes = title.getBytes(StandardCharsets.UTF_8);

        // Converting to bytes using ISO-8859-1 encoding
        byte[] isoBytes = title.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println("Length of original string: " + title.length());

        int TitleCodePoints = title.codePointCount(0, title.length());
        System.out.println("Code points in original string:" + TitleCodePoints);
        System.out.println("UTF-8 byte array length: " + utf8Bytes.length);
        System.out.println("ISO-8859-1 byte array length: " + isoBytes.length);

        // 2 char values from the title
        char char1 = title.charAt(3);
        char char2 = title.charAt(11);

        System.out.println("Character at index 3: " + char1);
        System.out.println("Character at index 11: " + char2);

    }
}
