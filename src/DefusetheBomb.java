public class DefusetheBomb {
    public int[] decrypt(int[] code, int k) {
        int length = code.length, temp;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            temp = 0;
            if (k>0){
                for (int j = 1; j <= Math.abs(k); j++) {
                    temp += code[(2 * length + j + i) % length];
                }
            }else{
                for (int j = Math.abs(k); j >0; j--) {
                    temp += code[(length - j + i) % length];
                }
            }
            result[i] = temp;
        }
        return result;
    }
}
