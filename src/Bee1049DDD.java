import java.util.Scanner;

public class Bee1049DDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 11 -> System.out.println("Sao Paulo");
            case 19 -> System.out.println("Campinas");
            case 21 -> System.out.println("Rio de Janeiro");
            case 27 -> System.out.println("Vitoria");
            case 31 -> System.out.println("Belo Horizonte");
            case 32 -> System.out.println("Juiz de Fora");
            case 61 -> System.out.println("Brasilia");
            case 71 -> System.out.println("Salvador");
            default -> System.out.println("DDD nao cadastrado");
        }

    }
}
