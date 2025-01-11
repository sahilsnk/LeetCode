import java.util.HashMap;

public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        boolean result = true;
        final int[] oddcount = {0};
        HashMap<Character, Integer>hashMap = new HashMap<>();
        for(char a : s.toCharArray()) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }
        hashMap.forEach((key,value)->{
            if(value % 2 != 0) oddcount[0]++;
        });
        if(oddcount[0] > k) return false;
        System.out.println(hashMap);
        return result;
    }
}
