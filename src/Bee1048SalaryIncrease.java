import java.util.Scanner;

public class Bee1048SalaryIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float amount = scanner.nextFloat();
        if (amount > 0 && amount <= 400.00) {
            float increment = (amount * 15) / 100;
            System.out.printf("Novo salario: %.2f\n", (amount+increment));
            System.out.printf("Reajuste ganho: %.2f\n", increment);
            System.out.println("Em percentual: 15 %");
        }
        else if (amount > 400.00 && amount <= 800.00) {
         float increment = (float) ((amount * 12.00) / 100);
         System.out.printf("Novo salario: %.2f\n", (amount+increment));
         System.out.printf("Reajuste ganho: %.2f\n", increment);
         System.out.println("Em percentual: 12 %");
        }
        else if (amount > 800.00 && amount <= 1200.00) {
         float increment = (float) ((amount * 10.00) / 100);
         System.out.printf("Novo salario: %.2f\n", (amount+increment));
         System.out.printf("Reajuste ganho: %.2f\n", increment);
         System.out.println("Em percentual: 10 %");
        }
        else if (amount > 1200.00 && amount <= 2000.00) {
         float increment = (float) ((amount * 7.00) / 100);
         System.out.printf("Novo salario: %.2f\n", (amount+increment));
         System.out.printf("Reajuste ganho: %.2f\n", increment);
         System.out.println("Em percentual: 7 %");
        }
        else if (amount > 2000.00) {
         float increment = (float) ((amount * 4.00) / 100.00);
         System.out.printf("Novo salario: %.2f\n", (amount+increment));
         System.out.printf("Reajuste ganho: %.2f\n", increment);
         System.out.println("Em percentual: 4 %");
        }

    }
}
