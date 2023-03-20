import java.util.Scanner;

public class Bee1067OddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();;
        for (int i = 1; i <=value; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
