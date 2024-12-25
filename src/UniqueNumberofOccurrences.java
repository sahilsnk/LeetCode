import java.util.*;

public class UniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (Integer num : arr) {
            if (hashMap.containsKey(num)) {
                hashMap.replace(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
                count++;
            }
        }
        Set<Integer> valueSet = new HashSet<>(hashMap.values());
        return count == valueSet.size();
    }
}
