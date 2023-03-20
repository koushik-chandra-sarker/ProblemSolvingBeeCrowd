import java.util.Scanner;

public class Bee1044Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        if (b%a == 0 || a%b == 0) {
            System.out.println("Sao Multiplos");
        }else System.out.println("Nao sao Multiplos");
    }
}
