import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee1080HighestAndPosition {
    public static void main(String[] args) throws IOException {

        Scanner input =new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Integer n = input.nextInt();
            numbers.add(n);
        }
        Integer max = Collections.max(numbers);
        System.out.println(max);
        System.out.println(numbers.indexOf(max)+1);
    }
}
