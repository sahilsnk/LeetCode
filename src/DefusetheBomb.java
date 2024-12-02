public class DefusetheBomb {
    public int[] decrypt(int[] code, int k) {
        int result[] = code;

        int length = code.length;

        for (int i = 0; i < length; i++) {
            int temp = 0;
            for (int j = 1; j <= k; j++) {
               temp +=  code[(length + j) % length];
            }
            result[i] = temp;
        }
        return result;
    }
}
