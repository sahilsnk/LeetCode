import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BestSightseeingPair {
    public int maxScoreSightseeingPair(int[] values) {
        int maxScore = Integer.MIN_VALUE;
        int maxLeft = values[0] + 0;
        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, maxLeft + values[j] - j);
            maxLeft = Math.max(maxLeft, values[j] + j);
        }
        return maxScore;
    }

}
