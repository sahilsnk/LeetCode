import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        Comparator<int[]> classComparator = (a, b) -> -Double.compare(
                ((double)a[1] - a[0])/((double)a[1] * a[1] + a[1]),
                ((double)b[1] - b[0])/((double)b[1] * b[1] + b[1]));
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(classComparator);
        for (int[] row: classes) maxHeap.add(row);
        for (int i = 0; i < extraStudents; ++i) {
            int[] row = maxHeap.poll();
            ++row[0];
            ++row[1];
            maxHeap.add(row);
        }
        double result = 0;
        while (!maxHeap.isEmpty()) {
            int[] row = maxHeap.poll();
            result += (double)row[0] / row[1];
        }
        result /= classes.length;
        return result;
    }
}
