public class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        // loop while both have characters
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i)); // take from word1
            result.append(word2.charAt(j)); // take from word2
            i++;
            j++;
        }
        
        // if word1 has extra chars
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }
        
        // if word2 has extra chars
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }
        
        return result.toString();
    }
}