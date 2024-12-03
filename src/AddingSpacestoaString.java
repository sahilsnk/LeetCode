import java.util.ArrayList;

public class AddingSpacestoaString {
    public String addSpaces(String s, int[] spaces) {
        ArrayList<Character> list = new ArrayList<>();
        char[] sentence = s.toCharArray();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == spaces[k]) {
                if(k<spaces.length -1)k++;
                list.add(' ');
                list.add(sentence[i]);
            }else list.add(sentence[i]);
        }
        return list.toString().substring(1, 3 * list.size() - 1).replaceAll(", ", "");
    }
}
