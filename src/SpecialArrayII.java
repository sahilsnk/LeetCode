public class SpecialArrayII {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {

        boolean[] result = new boolean[queries.length];
        
        return result;

    }
    public void demo(int[] nums, int[][] queries){
        boolean[] result = new boolean[queries.length];
        for (int i = 0; i < queries.length; i++) result[i] = true;

        for (int i = 0; i < queries.length; i++) {
            for (int j =  queries[i][0]; j < queries[i][1]; j++) {
                if ((nums[j] % 2 == 0 && nums[j + 1] % 2 == 0) || (nums[j] % 2 == 1 && nums[j + 1] % 2 == 1)) {
                    result[i] = false;
                    break;
                }
            }
        }
    }
}
