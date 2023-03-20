import java.io.IOException;

public class Bee1097SequenceIJ3 {
    public static void main(String[] args) throws IOException {
        int k = 1;
        int startValue = 7;
        for (int i = 1; i<=9; i+=2) {
            int j = startValue;
            while ((k++)<=3) {
                System.out.println(String.format("I=%d J=%d", i, j--));
            }
            startValue += 2;
            k=1;
        }
    }
}
