import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CountVowelStringsinRanges checker = new CountVowelStringsinRanges();
        int[][] values = {{0,2},{1,4},{1,1}};
        String[] words = {"aba","bcb","ece","aa","e"};
        System.out.println(Arrays.toString(checker.vowelStrings(words, values)));
    }
}