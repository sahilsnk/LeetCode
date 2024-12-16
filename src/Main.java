import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FinalArrayStateAfterKMultiplicationOperationsI checker = new FinalArrayStateAfterKMultiplicationOperationsI();
        int[] nums = {2,1,3,5,6};
        System.out.println(Arrays.toString(checker.getFinalState(nums, 5, 2)));

    }
}