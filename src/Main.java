import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MakeStringaSubsequenceUsingCyclicIncrements checker = new MakeStringaSubsequenceUsingCyclicIncrements();

        System.out.println(Arrays.toString(new boolean[]{checker.canMakeSubsequence("abc", "ad")}));
    }
}