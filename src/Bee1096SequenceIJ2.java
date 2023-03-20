import java.io.IOException;

public class Bee1096SequenceIJ2 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i<=9; i+=2) {
            for (int j = 7; j >=5; j--) {
                System.out.println(String.format("I=%d J=%d", i, j));
            }
        }
    }
}
