import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j  = nums.length-1;
        while(i < j){
            for (int k = i+1; k < j; k++) {
                if(nums[i]+nums[j]+nums[k] == 0) {
                    List<Integer>list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    result.add(list);

                    i++;
                    j--;
                }
            }
            if(nums[i] + nums[j] > 0) j--;
            else i++;
        }
        return result;
    }
}
