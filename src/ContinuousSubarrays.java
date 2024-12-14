import java.util.Arrays;

public class ContinuousSubarrays {
    public static long continuousSubarrays(int[] nums) {
        int n = nums.length;
        long count = 0;
        int start = 0;
        int min = nums[0];
        int max = nums[0];

        for (int end = 0; end < n; end++) {
            min = Math.min(min, nums[end]);
            max = Math.max(max, nums[end]);
            while (max - min > 2) {
                start++;
                min = Arrays.stream(Arrays.copyOfRange(nums, start, end + 1)).min().orElse(nums[start]);
                max = Arrays.stream(Arrays.copyOfRange(nums, start, end + 1)).max().orElse(nums[start]);
            }
            count += (end - start + 1);
        }

        return count;
    }
}
