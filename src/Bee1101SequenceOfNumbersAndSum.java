import java.io.IOException;
import java.util.Scanner;

public class Bee1101SequenceOfNumbersAndSum {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n <=0 || m <= 0) return;
            if (n < m){
                int sum = 0;
                for (int i = n; i <=m; i++) {
                    System.out.printf("%d ",i);
                    sum += i;
                }
                System.out.println("Sum="+sum);
            }
            else {
                int sum = 0;
                for (int i = m; i <=n; i++) {
                    System.out.printf("%d ",i);
                    sum += i;
                }
                System.out.println("Sum="+sum);
            }
        }
    }
}
