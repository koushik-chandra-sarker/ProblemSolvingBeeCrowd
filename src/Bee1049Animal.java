import java.util.Scanner;

public class Bee1049Animal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        if (s1.equals("vertebrado") && s2.equals("ave") && s3.equals("carnivoro")) {
            System.out.println("aguia");
        }else if (s1.equals("vertebrado") && s2.equals("ave") && s3.equals("onivoro")) {
            System.out.println("pomba");
        }else if (s1.equals("vertebrado") && s2.equals("mamifero") && s3.equals("onivoro")) {
            System.out.println("homem");
        }else if (s1.equals("vertebrado") && s2.equals("mamifero") && s3.equals("herbivoro")) {
            System.out.println("vaca");
        }else if (s1.equals("invertebrado") && s2.equals("inseto") && s3.equals("hematofago")) {
            System.out.println("pulga");
        }else if (s1.equals("invertebrado") && s2.equals("inseto") && s3.equals("herbivoro")) {
            System.out.println("lagarta");
        }else if (s1.equals("invertebrado") && s2.equals("anelideo") && s3.equals("hematofago")) {
            System.out.println("sanguessuga");
        }else if (s1.equals("invertebrado") && s2.equals("anelideo") && s3.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
