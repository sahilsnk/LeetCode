public class MakeStringaSubsequenceUsingCyclicIncrements {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        while(i< str1.length() && j < str2.length()){
            if(c1[i] == c2[j] || (c1[i] + 1 - 'a') % 26 == (c2[j] - 'a')){
                j++;
                i++;
            }else{
                i++;
            }
        }
        return j == str2.length();
    }
}
