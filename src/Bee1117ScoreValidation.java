import java.io.IOException;
import java.util.Scanner;

public class Bee1117ScoreValidation {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Float a = null, b = null;
        while (true){
            float c = scan.nextFloat();
            if (c >= 0 && c <= 10){
                if (a == null) a = c; else b = c;
            }
            else System.out.println("nota invalida");
            if (a != null && b != null ) {
                System.out.printf("media = %.2f\n", (a+b)/2);
                return;
            }
        }

    }
}

