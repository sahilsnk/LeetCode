import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromtheRichestPile {
    @SuppressWarnings("DataFlowIssue")
    public long pickGifts(int[] gifts, int k) {
        long result =  0;
        PriorityQueue<Integer>queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int a:gifts)queue.add(a);
        for (int i = 0; i < k; i++) queue.add((int) Math.sqrt(queue.poll()));
        while(queue.size()!=0) result = result + queue.poll();
        return result;
    }
}
