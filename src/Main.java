import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //CheckIfaWordOccursAsaPrefixofAnyWordinaSentence checker = new CheckIfaWordOccursAsaPrefixofAnyWordinaSentence();
        DefusetheBomb checker = new DefusetheBomb();

        System.out.println(Arrays.toString(checker.decrypt(new int[]{5,7,1,4}, 3)));
    }
}