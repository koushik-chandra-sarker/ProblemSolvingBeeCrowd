import java.io.IOException;
import java.util.Scanner;

public class Bee1074EvenOrOdd {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int j = input.nextInt();
            if (j == 0) System.out.println("NULL");
            else if(j % 2 != 0 && j < 0) System.out.println("ODD NEGATIVE");
            else if(j % 2 != 0 && j > 0) System.out.println("ODD POSITIVE");
            else if(j % 2 == 0 && j  > 0) System.out.println("EVEN POSITIVE");
            else System.out.println("EVEN NEGATIVE");
            
        }
    }
}
