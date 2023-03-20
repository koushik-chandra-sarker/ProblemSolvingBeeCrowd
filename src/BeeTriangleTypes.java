import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BeeTriangleTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] sides = new Double[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = scanner.nextDouble();
        }
        Arrays.sort(sides, Collections.reverseOrder());
        double A = sides[0];
        double B = sides[1];
        double C = sides[2];
        double v = Math.pow(B, 2) + Math.pow(C, 2);
        if (A >= B+C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if (Math.pow(A, 2) == v){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if (Math.pow(A, 2) > v){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if (Math.pow(A, 2) < v){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((A == B && B != C) || (A == C && B != C) || (C == B && B != A)){
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}
