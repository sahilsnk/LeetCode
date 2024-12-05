
public class MovePiecestoObtainaString {
    public boolean canChange(String start, String target) {
       char[] str = start.toCharArray();
       char[] tar = target.toCharArray();
       int i = 0;
       int j = 0;
       while(i < start.length() && j < target.length()) {
           if (str[i] == '_') i++;
           else if (tar[j] == '_') j++;
           else if (str[i] != tar[j]) return false;
           else if (str[i] == tar[j]) {
               if (str[i] == 'R' && j < i) return false;
               else if (str[i] == 'L' && i < j) return false;
               else {
                   i++;
                   j++;
               }
           }
       }
       i=0;j=0;
       int l_count = 0;
       int r_count = 0;
        while(i<start.length()){
            if(str[i] == 'R') r_count++;
            if(str[i] == 'L') l_count++;
            i++;
        }
        while(j<target.length()){
            if(tar[j] == 'R') r_count--;
            if(tar[j] == 'L') l_count--;
            j++;
        }

        return l_count == 0 && r_count == 0;
    }
}
