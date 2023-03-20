import java.io.IOException;
import java.util.Scanner;

public class Bee1078MultiplicationTable {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", i, n, i*n));
        }
    }
}
