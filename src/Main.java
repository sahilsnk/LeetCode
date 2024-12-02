import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //CheckIfaWordOccursAsaPrefixofAnyWordinaSentence checker = new CheckIfaWordOccursAsaPrefixofAnyWordinaSentence();
        DefusetheBomb checker = new DefusetheBomb();

        System.out.println(Arrays.toString(checker.decrypt(new int[]{2,4,9,3}, -2)));
    }
}