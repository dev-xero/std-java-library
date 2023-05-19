import StdAPI.StdIn;
import StdAPI.StdOut;

public class StdAPITest {
    public static void main(String[] args) {
        StdOut.printf("%.5f\n", Math.PI);
        StdOut.printf("%.2f\n", Math.E);

        StdOut.println(StdIn.isEmpty());
    }
}
