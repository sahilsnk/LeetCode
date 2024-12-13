import java.util.Arrays;
import java.util.PriorityQueue;

public class FindScoreofanArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
        long result = 0;
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0])
        );
        for (int i = 0; i < nums.length; i++) {
            int[] values = new int[2];
            values[0] = nums[i];
            values[1] = i;
            queue.offer(values);
        }
        while(queue.size()!=0){
            if(!visited[queue.peek()[1]]){
                result = result + queue.peek()[0];
                visited[queue.peek()[1]] = true;
                if (queue.peek()[1]+1 < nums.length) visited[queue.peek()[1] + 1] = true;
                if (queue.peek()[1]-1 >= 0) visited[queue.peek()[1] - 1] = true;
                queue.poll();
            }else queue.poll();

        }
        return result;
    }
}
