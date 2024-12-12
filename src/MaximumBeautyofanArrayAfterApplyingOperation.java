import java.util.Arrays;
import java.util.Collections;

public class MaximumBeautyofanArrayAfterApplyingOperation {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int maxCount = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > 2 * k) {
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
