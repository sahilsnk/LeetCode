import java.util.Arrays;
import java.util.List;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split("\\s+");
        System.out.println(Arrays.asList(words));
        for (int i = 0; i < words.length; i++) {
            if(words[i].startsWith(searchWord)) return i+1;
        }return -1;
    }
}
