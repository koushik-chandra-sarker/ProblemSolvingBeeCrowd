import java.util.Scanner;

public class Bee1060PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value;
        int count = 0;
        for (int i = 0; i < 6; i++) {
            value = scanner.nextFloat();
            if (value > 0) {
                count++;
            }
        }
        System.out.println(count+" valores positivos");
    }
}
