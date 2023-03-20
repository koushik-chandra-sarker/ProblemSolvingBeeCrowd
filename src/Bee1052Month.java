import java.time.Month;
import java.util.Scanner;

public class Bee1052Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String monthName = Month.of(n).name().toLowerCase();
        System.out.println(monthName.substring(0, 1).toUpperCase() + monthName.substring(1));

    }
}
