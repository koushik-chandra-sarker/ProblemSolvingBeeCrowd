import java.io.IOException;
import java.util.Scanner;

public class Bee1079WeightedAverages {
    public static void main(String[] args) throws IOException {

        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            float a = input.nextFloat();
            float b = input.nextFloat();
            float c = input.nextFloat();
            float average = ( a*2 + b*3 + c*5 ) / 10;
            System.out.printf("%.1f\n", average);
        }
    }
}
