import java.util.HashMap;

public class FindLongestSpecialSubstringThatOccursThriceI {
    public int maximumLength(String s) {
        if (s == null || s.length() < 3) {
            return 0; // If the string is too short, no valid substring can exist
        }

        int maxLength = 0;
        HashMap<String, Integer> substringCount = new HashMap<>();

        // Try all possible lengths for substrings
        for (int len = 1; len <= s.length() / 3; len++) {
            System.out.println("Checking substrings of length: " + len); // Print for iteration
            substringCount.clear();

            // Generate substrings of the current length and count their occurrences
            for (int i = 0; i <= s.length() - len; i++) {
                String substring = s.substring(i, i + len);
                substringCount.put(substring, substringCount.getOrDefault(substring, 0) + 1);

                // Debugging: print the current substring and its count
                System.out.println("Substring: " + substring + " Count: " + substringCount.get(substring));

                // Check if the substring occurs at least 3 times
                if (substringCount.get(substring) >= 3) {
                    maxLength = Math.max(maxLength, len);
                }
            }
        }

        return maxLength;
    }


}
