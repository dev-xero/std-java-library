package StdAPI;

import java.util.Arrays;
import java.util.Random;

public class StdStats {
    public static int max(int[] array) {
        int max = array[0];

        for (int item : array) {
            if (item > max) max = item;
        }

        return max;
    }

    public static double max(double[] array) {
        double max = array[0];

        for (double item : array) {
            if (item > max) max = item;
        }

        return max;
    }

    public static float max(float[] array) {
        float max = array[0];

        for (float item : array) {
            if (item > max) max = item;
        }

        return max;
    }

    public static int min(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min) min = i;
        }

        return min;
    }

    public static double min(double[] array) {
        double min = array[0];

        for (double i : array) {
            if (i < min) min = i;
        }

        return min;
    }

    public static float min(float[] array) {
        float min = array[0];

        for (float i : array) {
            if (i < min) min = i;
        }

        return min;
    }

    public static int mean(int[] array) {
        int size = array.length;
        int sum = 0;

        for (int i : array) sum += i;

        return sum / size;
    }

    public static double mean(double[] array) {
        int size = array.length;
        double sum = 0;

        for (double i : array) sum += i;

        return sum / size;
    }

    public static float mean(float[] array) {
        int size = array.length;
        float sum = 0;

        for (float i : array) sum += i;

        return sum / size;
    }

    public static double variance(int[] array) {
        int mean = mean(array);
        int squareSumOfDiff = 0;

        for (int i : array) {
            squareSumOfDiff += Math.pow((i - mean), 2);
        }

        return (double) squareSumOfDiff / array.length;
    }

    public static double variance(double[] array) {
        double mean = mean(array);
        double squareSumOfDiff = 0;

        for (double i : array) {
            squareSumOfDiff += Math.pow((i - mean), 2);
        }

        return squareSumOfDiff / array.length;
    }

    public static float variance(float[] array) {
        float mean = mean(array);
        float squareSumOfDiff = 0;

        for (float i : array) {
            squareSumOfDiff += Math.pow((i - mean), 2);
        }

        return squareSumOfDiff / array.length;
    }

    public static double stdDeviation(int[] array) {
        return Math.sqrt(variance(array));
    }

    public static double stdDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }

    public static double stdDeviation(float[] array) {
        return Math.sqrt(variance(array));
    }

    public static double median(int[] array) {
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }
        int midIndex = array.length / 2;
        return (double) (array[midIndex] + array[midIndex - 1]) / 2;
    }

    public static double median(double[] array) {
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }
        int midIndex = array.length / 2;
        return (array[midIndex] + array[midIndex - 1]) / 2;
    }

    public static float median(float[] array) {
        if (array.length % 2 != 0) {
            return array[array.length / 2];
        }
        int midIndex = array.length / 2;
        return (array[midIndex] + array[midIndex - 1]) / 2;
    }

    public static void main(String[] args) {
        int[] intTestArray = new int[5];
        int[] intEvenSizedTestArray = new int[4];
        double[] doubleTestArray = new double[5];
        float[] floatTestArray = new float[5];

        Random randomGenerator = new Random();

        // initialize arrays
        for (int i = 0; i < 5; i++) {
            intTestArray[i] = randomGenerator.nextInt(64);
            doubleTestArray[i] = randomGenerator.nextDouble(64);
            floatTestArray[i] = randomGenerator.nextFloat(64);
        }

        for (int i = 0; i < 4; i++) {
            intEvenSizedTestArray[i] = randomGenerator.nextInt(64);
        }
        Arrays.sort(intEvenSizedTestArray);

        for (int i : intTestArray) {
            StdOut.print(i + " ");
        }

        StdOut.println();

        for (double i : doubleTestArray) {
            StdOut.print(i + " ");
        }

        StdOut.println();

        for (float i : floatTestArray) {
            StdOut.print(i + " ");
        }

        StdOut.println();

        StdOut.println(max(intTestArray));
        StdOut.println(max(doubleTestArray));
        StdOut.println(max(floatTestArray));

        StdOut.println();

        StdOut.println(min(intTestArray));
        StdOut.println(min(doubleTestArray));
        StdOut.println(min(floatTestArray));

        StdOut.println();
        StdOut.println(variance(intTestArray));

        StdOut.println();
        StdOut.println(stdDeviation(intTestArray));

        StdOut.println();
        StdOut.println(median(intTestArray));

        StdOut.println();
        for (int i : intEvenSizedTestArray) {
            StdOut.print(i + " ");
        }

        StdOut.println();
        StdOut.println(median(intEvenSizedTestArray));
    }
}
