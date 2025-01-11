public class CountVowelStringsinRanges {
    public boolean check(char word){
        return word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] result = new int[queries.length];
        int[] values = new int[words.length];
        int[] prefix = new int[words.length + 1];
        int i = 0;
        for (String word : words) {
            if (check(word.charAt(0)) && check(word.charAt(word.length() - 1))) {
                values[i] = 1;
            } else {
                values[i] = 0;
            }
            i++;
        }
        for (i = 0; i < words.length; i++) prefix[i + 1] = prefix[i] + values[i];
        for (i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            result[i] = prefix[end + 1] - prefix[start];
        }
        return result;
    }
}
