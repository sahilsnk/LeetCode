import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //CheckIfaWordOccursAsaPrefixofAnyWordinaSentence checker = new CheckIfaWordOccursAsaPrefixofAnyWordinaSentence();
        LengthofLastWord checker = new LengthofLastWord();

        System.out.println(Arrays.toString(new int[]{checker.lengthOfLastWord("Hello World asdf asdf asf g dkjnb43w6   f dfff    ")}));
    }
}