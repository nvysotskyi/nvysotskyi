import java.util.Arrays;
import java.util.Locale;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder result = new StringBuilder();
        String[] temp = s.split(" ");
        for (int i = 0; i < k; i++){
            result.append(temp[i] + " ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        TruncateSentence truncateSentence = new TruncateSentence();
        System.out.println(truncateSentence.truncateSentence("Hello how are you Contestant", 4));

    }
}
