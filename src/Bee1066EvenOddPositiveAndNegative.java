import java.util.Scanner;

public class Bee1066EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float value;
        int even = 0, odd = 0, positive = 0, negative = 0;
        for (int i = 0; i < 5; i++) {
            value = scanner.nextFloat();
            if (value%2 == 0) {
                even++;
            }
            else if (value%2 !=0){
                odd++;
            }
            if (value > 0) {
                positive++;
            }
            else if (value < 0) {
                negative++;
            }
        }
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positive+" valor(es) positivo(s)");
        System.out.println(negative+" valor(es) negativo(s)");
    }
}
