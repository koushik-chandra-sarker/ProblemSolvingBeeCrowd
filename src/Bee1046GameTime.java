import java.util.Scanner;

public class Bee1046GameTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int time;
        if (a<b){
            time = b-a;
        }else{
            time = 24-a+b;
        }
        System.out.println(String.format("O JOGO DUROU %d HORA(S)", time));
    }
}
