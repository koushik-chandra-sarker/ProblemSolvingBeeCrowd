import java.io.IOException;
import java.util.Scanner;

public class Bee1115Quadrant {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n==0 || m == 0) return;
            if (n > 0 && m > 0) System.out.println("primeiro");
            if (n > 0 && m < 0) System.out.println("quarto");
            if (n < 0 && m < 0) System.out.println("terceiro");
            if (n < 0 && m > 0) System.out.println("segundo");
        }
    }
}
