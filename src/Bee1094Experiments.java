import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Bee1094Experiments {
    public static void main(String[] args) throws IOException {

        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int total = 0, total_c = 0, total_r = 0, total_s = 0;
        for (int i = 0; i < n; i++) {
            int amount = input.nextInt();
            String animal = input.nextLine();
            total += amount;
            if (Objects.equals(animal.trim(), "C")) total_c+=amount;
            else if (Objects.equals(animal.trim(), "R")) total_r+=amount;
            else if (Objects.equals(animal.trim(), "S")) total_s+=amount;
        }
        System.out.println(String.format("Total: %d cobaias", total));
        System.out.println(String.format("Total de coelhos: %d", total_c));
        System.out.println(String.format("Total de ratos: %d", total_r));
        System.out.println(String.format("Total de sapos: %d", total_s));
        System.out.println(String.format("Percentual de coelhos: %.2f %%", (float) (100*total_c)/total));
        System.out.println(String.format("Percentual de ratos: %.2f %%", (float) (100*total_r)/total));
        System.out.println(String.format("Percentual de sapos: %.2f %%", (float) (100*total_s)/total));

    }
}
