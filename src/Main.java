import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FindScoreofanArrayAfterMarkingAllElements checker = new FindScoreofanArrayAfterMarkingAllElements();
        int[] nums = {2,5,6,6,10};
        System.out.println(Arrays.toString(new int[]{(int) checker.findScore(nums)}));

    }
}