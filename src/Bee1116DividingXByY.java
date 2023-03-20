import java.io.IOException;
import java.util.Scanner;

public class Bee1116DividingXByY {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            float a = scan.nextInt();
            float b = scan.nextInt();
            Float c = a / b;
            if (c.isInfinite() || c.isNaN()) System.out.println("divisao impossivel");
            else System.out.printf("%.1f\n", c);
        }
    }
}

