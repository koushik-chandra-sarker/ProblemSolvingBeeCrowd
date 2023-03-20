import java.io.IOException;

public class Bee1095SequenceIJ1 {
    public static void main(String[] args) throws IOException {
        for (int j = 60, i= 1; j>=0; j-=5, i+=3) {
            System.out.println(String.format("I=%d J=%d", i, j));
        }
    }
}
