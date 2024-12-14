import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ContinuousSubarrays checker = new ContinuousSubarrays();
        int[] nums = {65,66,67,66,66,65,64,65,65,64};
        System.out.println(Arrays.toString(new int[]{(int) checker.continuousSubarrays(nums)}));

    }
}