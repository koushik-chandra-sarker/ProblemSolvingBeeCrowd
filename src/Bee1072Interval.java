import java.util.Scanner;

public class Bee1072Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0, out = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            if (value >= 10 && value <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
