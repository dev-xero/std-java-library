package StdAPI;

import java.io.BufferedInputStream;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
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

    public static int readInt() {
        try {
            return scanner.nextInt();
        } catch(InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException(
                    "attempts to read an 'int' value from standard input, " +
                    "but next token is \"" + token + "\"."
            );
        } catch(NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read an 'int' from standard input, but no more tokens are available."
            );
        }
    }

    public static double readDouble() {
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException(
                    "attempts to read an 'double' value from standard input, " +
                    "but next token is \"" + token + "\"."
            );
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read a 'double' from standard input, but no more tokens are available."
            );
        }
    }

    public static float readFloat() {
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException(
                    "attempts to read a 'float' value from standard input, " +
                    "but next token is \"" + token + "\"."
            );
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read a 'float' from standard input, but no more tokens are available."
            );
        }
    }

    public static long readLong() {
        try {
            return scanner.nextLong();
        } catch (InputMismatchException e) {
            String token = scanner.next();
            throw new InputMismatchException(
                    "attempts to read a 'long' value from standard input, " +
                    "but next token is \"" + token + "\"."
            );
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read a 'long' from standard input, but no more tokens are available."
            );
        }
    }

    public static boolean readBoolean() {
        try {
            String token = scanner.next();
            if (token.equalsIgnoreCase("true"))  return true;
            if (token.equalsIgnoreCase("1"))     return true;
            if (token.equalsIgnoreCase("false")) return false;
            if (token.equalsIgnoreCase("0"))     return false;
            throw new InputMismatchException(
                    "attempts to read a 'boolean' value from standard input, " +
                    "but next token is \"" + token + "\"."
            );
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read a 'boolean' from standard input, but no more tokens are available."
            );
        }
    }

    public static char readChar() {
        try {
            scanner.useDelimiter(WHITE_SPACE_PATTERN);
            String ch = scanner.next();
            return ch.charAt(0);
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(
                    "attempts to read a 'char' from standard input, but no more tokens are available."
            );
        }
    }

    public static String readAll() {
        if (!scanner.hasNext()) {
            return "";
        }
        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
        scanner.useDelimiter(WHITE_SPACE_PATTERN);
        return result;
    }

    public static void main(String[] args) {
        StdOut.print("Type int: ");
        int a = StdIn.readInt();
        StdOut.println("Your int was " + a);
        StdOut.println();

        StdOut.print("Type double: ");
        double b = StdIn.readDouble();
        StdOut.println("Your double was " + b);
        StdOut.println();

        StdOut.print("Type float: ");
        float c = StdIn.readFloat();
        StdOut.println("Your float was " + c);
        StdOut.println();

        StdOut.print("Type long: ");
        long d = StdIn.readLong();
        StdOut.println("Your long was " + d);
        StdOut.println();

        StdOut.print("Type boolean: ");
        boolean e = StdIn.readBoolean();
        StdOut.println("Your boolean was " + e);
        StdOut.println();
    }
}
