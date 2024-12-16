import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            } else {
                return Integer.compare(a[0], b[0]);
            }
        });
        for (int a:nums) {
            int[] val = new int[2];
            val[0] = i++;
            val[1] = a;
            queue.add(val);
        }
        for (i = 0; i < k; i++) {
            int[] val = queue.poll();
            val[1] *= multiplier;
            queue.add(val);}
        int[] result = new int[nums.length];
        while (!queue.isEmpty()) {
            int[] val = queue.poll();
            result[val[0]] = val[1];
        }
        return result;
    }
}
