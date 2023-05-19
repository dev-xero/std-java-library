package TestExercises;

import java.util.HashMap;
import java.util.Random;

/**
 * Fibonacci sequence but with caching
 */
class Fibonacci {
    public static long F(int N, HashMap<Integer, Long> cache) {
        if (N == 0) {
            cache.put(0, 0L);
            return 0;
        }

        if (N == 1) {
            cache.put(1, 1L);
            return 1;
        }

        cache.put(N, cache.get(N - 2) + cache.get(N - 1));

        return cache.get(N - 2) + cache.get(N - 1);
    }
}

public class TestExercise {
    private static boolean isBetweenZeroAndOne(double x, double y) {
        return (x > 0 && x < 1) && (y > 0 && y < 1);
    }

    public static String toBinaryString(int theInt) {
        StringBuilder binaryForm = new StringBuilder();

        for (int i = theInt; i > 0; i /= 2) {
            binaryForm.append(i % 2);
        }

        return binaryForm.reverse().toString();
    }

    public static void printTwoDimensionalArray(boolean[][] theArray) {
        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                System.out.printf("[%b] ", theArray[i][j]);
            }

            System.out.println();
        }
    }

    public static void printTwoDimensionalArray(int[][] theArray) {
        for (int i = 0; i < theArray.length; i++) {
            for (int j = 0; j < theArray[i].length; j++) {
                System.out.printf("[%d] ", theArray[i][j]);
            }

            System.out.println();
        }
    }

    public static int[][] matrixTranspose(int[][] theArray) {
        int cols = theArray[0].length;
        int rows = theArray.length;

        int[][] transposeArray = new int[cols][rows];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                transposeArray[j][i] = theArray[i][j];
            }
        }

        return transposeArray;
    }

    /**
     * takes an integer "N" and returns the largest integer not larger than lg(N)
     * @return an int
     */
    public static int lg(int N) {
        if (N == 1) return 0;

        return 1 + lg(N / 2);
    }

    public static void main(String[] args) {
        if (args.length == 3) {
            try {
                String output;

                int argumentNumOne = Integer.parseInt(args[0]);
                int argumentNumTwo = Integer.parseInt(args[1]);
                int argumentNumThree = Integer.parseInt(args[2]);

                output = (argumentNumTwo == argumentNumThree && argumentNumOne == argumentNumThree)
                        ? "equal"
                        : "not equal";

                System.out.println(output);

            } catch (NumberFormatException e) {

                throw new NumberFormatException(
                        "One or all of the provided strings is not a valid integer"
                );
            }
        } else {
            throw new RuntimeException(
                    "Pass exactly three integers as arguments, " +
                    "format: <int> <int> <int>"
            );
        }

        double testX = 0.3;
        double testY = 0.4;

        System.out.println(isBetweenZeroAndOne(testX, testY));
        System.out.println(toBinaryString(10));
        System.out.println();

        Random generator = new Random();

        boolean[][] testBooleanTwoDmArray = new boolean[2][3];
        int[][] testIntTwoDmArray = new int[2][3];
        int[][] testIntSquareMatrix = new int[2][2];
        int[][] testThreeByThreeSquareMatrix = new int[3][3];

        testBooleanTwoDmArray[0][0] = true;
        testBooleanTwoDmArray[0][1] = true;
        testBooleanTwoDmArray[0][2] = true;
        testBooleanTwoDmArray[1][0] = true;
        testBooleanTwoDmArray[1][1] = true;
        testBooleanTwoDmArray[1][2] = false;

        testIntTwoDmArray[0][0] = 1;
        testIntTwoDmArray[0][1] = 2;
        testIntTwoDmArray[0][2] = 4;
        testIntTwoDmArray[1][0] = 5;
        testIntTwoDmArray[1][1] = 8;
        testIntTwoDmArray[1][2] = 9;

        testIntSquareMatrix[0][0] = 1;
        testIntSquareMatrix[0][1] = 3;
        testIntSquareMatrix[1][0] = 7;
        testIntSquareMatrix[1][1] = 9;

        for (int i = 0; i < testThreeByThreeSquareMatrix.length; i++) {
            for (int j = 0; j < testThreeByThreeSquareMatrix.length; j++) {
                testThreeByThreeSquareMatrix[i][j] = generator.nextInt(16);
            }
        }

        printTwoDimensionalArray(testBooleanTwoDmArray);
        System.out.println();

        System.out.println("- Matrix");
        printTwoDimensionalArray(testIntTwoDmArray);

        System.out.println("- Transposed");
        printTwoDimensionalArray(matrixTranspose(testIntTwoDmArray));
        System.out.println();

        System.out.println("- Matrix");
        printTwoDimensionalArray(testIntSquareMatrix);

        System.out.println("- Transposed");
        printTwoDimensionalArray(matrixTranspose(testIntSquareMatrix));
        System.out.println();

        System.out.println("- Matrix");
        printTwoDimensionalArray(testThreeByThreeSquareMatrix);

        System.out.println("- Transposed");
        printTwoDimensionalArray(matrixTranspose(testThreeByThreeSquareMatrix));
        System.out.println();

        System.out.println(lg(5));
        System.out.println();


        HashMap<Integer, Long> theCache = new HashMap<>();
        for (int i = 0; i <= 40; i++) {
            System.out.println(i + " " + Fibonacci.F(i, theCache));
        }
    }
}
