import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Bee1064PositivesAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value;
        int count = 0;
        int sum = 0;
        List<Float> positiveValues = new ArrayList<Float>();
        for (int i = 0; i < 6; i++) {
            value = scanner.nextFloat();
            if (value > 0) {
                positiveValues.add(value);
            }
        }
        System.out.println(positiveValues.size() + " valores positivos");
        OptionalDouble average = positiveValues.stream().mapToDouble(Float::floatValue).average();
        System.out.printf("%.1f\n",average.getAsDouble());
    }
}
