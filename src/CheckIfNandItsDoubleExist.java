import java.util.HashMap;
public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a:arr) {
            if(a == 0) continue;
            hashMap.put(a,0);
            if((a % 2 == 0 && hashMap.containsKey(a / 2) && a / 2 != 1) || (hashMap.containsKey(a * 2) && a * 2 != 1)) return true;
        }
        int flag = 0;
        for (int a:arr) {
            if(a == 0) flag += 1;
        }
        return flag >= 2;
    }
}
