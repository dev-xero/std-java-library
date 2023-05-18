package StdAPI;

public class StdOut {
    public static void print(String theString) {
        System.out.print(theString);
    }

    public static void print(int theInt) {
        System.out.print(theInt);
    }

    public static void print(double theDouble) {
        System.out.print(theDouble);
    }

    public static void print(float theFloat) {
        System.out.print(theFloat);
    }

    public static void print(boolean theBoolean) {
        System.out.print(theBoolean);
    }

    public static void println(String theString) {
        System.out.println(theString);
    }

    public static void println(int theInt) {
        System.out.println(theInt);
    }

    public static void println(double theDouble) {
        System.out.println(theDouble);
    }

    public static void println(float theFloat) {
        System.out.println(theFloat);
    }

    public static void println(boolean theBoolean) {
        System.out.println(theBoolean);
    }

    public static void println() {
        System.out.println();
    }

    public static void printf(String format, String theString) {
        System.out.printf(format, theString);
    }

    public static void printf(String format, int theInt) {
        System.out.printf(format, theInt);
    }

    public static void printf(String format, double theDouble) {
        System.out.printf(format, theDouble);
    }

    public static void printf(String format, float theFloat) {
        System.out.printf(format, theFloat);
    }

    public static void printf(String format, boolean theBoolean) {
        System.out.printf(format, theBoolean);
    }

    public static void main(String[] args) {
        String testString = "testing";

        println(testString);
        print(testString);
        println();
        printf("%-14.5s\n", "Hello, World");
    }
}
