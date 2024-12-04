import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CheckIfNandItsDoubleExist checker = new CheckIfNandItsDoubleExist();

        System.out.println(Arrays.toString(new boolean[]{checker.checkIfExist(new int[]{-2,0,10,-19,4,6,-8})}));
    }
}