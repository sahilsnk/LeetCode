import java.util.ArrayList;
import java.util.List;

public class MergeTwo2DArraysbySummingValues {
        public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
            List<int[]> resultList = new ArrayList<>();
            int i = 0, j = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i][0] == nums2[j][0]) {
                    resultList.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                    i++;
                    j++;
                } else if (nums1[i][0] < nums2[j][0]) {
                    resultList.add(new int[]{nums1[i][0], nums1[i][1]});
                    i++;
                } else {
                    resultList.add(new int[]{nums2[j][0], nums2[j][1]});
                    j++;
                }
            }
            while (i < nums1.length) {
                resultList.add(new int[]{nums1[i][0], nums1[i][1]});
                i++;
            }
            while (j < nums2.length) {
                resultList.add(new int[]{nums2[j][0], nums2[j][1]});
                j++;
            }
            return resultList.toArray(new int[resultList.size()][]);
        }
}
