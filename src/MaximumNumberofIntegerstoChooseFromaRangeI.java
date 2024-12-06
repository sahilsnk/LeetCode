import java.util.HashSet;

public class MaximumNumberofIntegerstoChooseFromaRangeI {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer>hashSet = new HashSet<>();
        for (int a:banned) {
            hashSet.add(a);
        }
        int count = 0, sum = 0;
        for (int j = 1; j <= n; j++) {
            if(sum+j > maxSum) break;
            if (!hashSet.contains(j)) {
                sum = sum + j;
                count++;
            }
        }
    return count;
    }
}
