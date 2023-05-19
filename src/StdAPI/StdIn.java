package StdAPI;

import java.io.BufferedInputStream;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StdIn {
    private static final String CHARSET_NAME = "UTF-8";
    private static final Locale LOCALE = Locale.US;
    private static final Pattern WHITE_SPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");
    private static final Pattern EMPTY_PATTERN = Pattern.compile("");
    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

    private static Scanner scanner;

    private StdIn() { } // don't instantiate this class

    static {
        resync();
    }

    private static void resync() {
        setScanner(new Scanner(new BufferedInputStream(System.in), CHARSET_NAME));
    }

    private static void setScanner(Scanner scanner) {
        StdIn.scanner = scanner;
        StdIn.scanner.useLocale(LOCALE);
    }

    public static boolean isEmpty() {
        try {
            return !scanner.hasNext();
        } catch(IllegalStateException e) {
            return true;
        }
    }

    public static void main(String[] args) {
        StdOut.println(StdIn.isEmpty());
    }
}
