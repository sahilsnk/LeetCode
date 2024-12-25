import java.util.Arrays;
import java.util.OptionalInt;

public class MaxChunksToMakeSorted {
    public static int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) chunks++;
        }
        return chunks;
    }
}
