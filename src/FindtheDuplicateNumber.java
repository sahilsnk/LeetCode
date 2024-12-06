import java.util.HashSet;

public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>hashSet = new HashSet<>();
        for (int a: nums) {
            if(!hashSet.contains(a))hashSet.add(a);
            else return a;
        }
        return -1;
    }
}