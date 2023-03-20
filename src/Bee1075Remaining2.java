import java.io.IOException;
import java.util.Scanner;

public class Bee1075Remaining2 {
    public static void main(String[] args) throws IOException {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        while (i <= 10000) {
            System.out.println(i);
            i+=n;
        }
    }
}
