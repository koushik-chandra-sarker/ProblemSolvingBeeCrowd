import java.util.Scanner;

public class Bee1051Taxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salary = scanner.nextFloat();
        if(salary <= 2000.00){
            System.out.println("Isento");
        }else if (salary >= 2000.01 && salary <= 3000.00){
            System.out.printf("R$ %.2f\n", (salary - 2000.00)*0.08);
        }else if (salary >= 3000.01 && salary <= 4500.00){
            System.out.printf("R$ %.2f\n", ((salary - 3000.00)*0.18 + 1000.00*0.08));
        }else if (salary >= 4500.01){
            System.out.printf("R$ %.2f\n", ((salary - 4500.00)*0.28 + 1500.00*0.18 + 1000.00*0.08));
        }
    }
}
