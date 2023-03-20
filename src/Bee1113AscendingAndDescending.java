import java.io.IOException;
import java.util.Scanner;

public class Bee1113AscendingAndDescending {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n == m) return;
            if (n < m) System.out.println("Crescente");
            else System.out.println("Decrescente");
        }
    }
}
