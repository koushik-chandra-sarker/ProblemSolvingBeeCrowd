import java.util.Arrays;
import java.util.Scanner;

public class Bee1042SimpleSort {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        Integer[] sorted = numbers.clone();
        Arrays.sort(sorted);
        for (Integer i : sorted) {
            System.out.println(i);
        }
        System.out.println();
        for (Integer i: numbers) {
            System.out.println(i);
        }
    }
}
