import java.util.Scanner;

public class Bee1043Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if ((a + b > c) && (a + c > b) && (b + c > a)){
            float perimeter = a+b+c;
            System.out.println("Perimetro = "+perimeter);
        }else{
            float area = ((a+b)/2)*c;
            System.out.println("Area = "+ area);
        }
    }
}
