import org.junit.jupiter.api.Test;

public class OperationTest {
    @Test
    void operation() {
        String word = "abcde";
        int i = word.length();
        int m = i/2;
        System.out.println(word.substring(m,m+1));
        System.out.println(i);
        System.out.println(m);
        //0h 1e 2l 3l 4o 5w 6o 7r 8l 9d
    }

    @Test
    void name() {
        int i =5/2;
        System.out.println(i);
    }
}
