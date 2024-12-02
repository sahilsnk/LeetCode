import java.util.Arrays;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        System.out.println(Arrays.asList(words));

        return words[words.length-1].length();
    }
}
