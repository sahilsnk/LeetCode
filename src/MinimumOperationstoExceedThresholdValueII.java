import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (num <= k) {
                minHeap.offer((long)num);
            }
        }
        int numOperations = 0;
        while (minHeap.size() > 0 && minHeap.peek() < k) {
            long x = minHeap.poll();
            numOperations++;
            if(minHeap.size()<1)break;
            long y = minHeap.poll();
            minHeap.add(x * 2 +  y);
        }
        return numOperations;
    }
}
