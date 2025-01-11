import java.util.Arrays;

public class TargetSum {
    int result = 0;
    private void helper(int[] nums, int target, int index, int currentSum) {
        if (index == nums.length) {
            if (currentSum == target) result++;
            return;
        }
        helper(nums, target, index + 1, currentSum + nums[index]);
        helper(nums, target, index + 1, currentSum - nums[index]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        helper(nums, target,0,0);
        return result;
    }
}
