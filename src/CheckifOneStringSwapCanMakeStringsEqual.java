public class CheckifOneStringSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int flag = 0;
        char[] string1 = s1.toCharArray();
        char[] string2 = s2.toCharArray();
        char a = 0;
        char b = 0;
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            if(string1[i] != string2[i]){
                if(flag == 0) {
                    a = string1[i];
                    b = string2[i];
                }else{
                    if(a != string2[i] || b != string1[i]) return false;
                }
                flag++;
            }
        };
        return flag == 2 || flag == 0;
    }
}
