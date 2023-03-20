import java.util.Scanner;

public class Bee1071SumOfConsecutiveOddNumbersI {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum = 0;
        int min;
        int max;

        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;

        }

        for (int j = min + 1; j < max; j++) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
