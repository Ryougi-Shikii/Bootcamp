import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.isEmpty()) return result;

        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        // Precompute palindrome states: dp[i][j] is true if s[i..j] is a palindrome
        for (int right = 0; right < n; right++) {
            for (int left = 0; left <= right; left++) {
                if (s.charAt(left) == s.charAt(right) && (right - left <= 2 || dp[left + 1][right - 1])) {
                    dp[left][right] = true;
                }
            }
        }

        backtrack(s, 0, dp, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, boolean[][] dp, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (dp[start][end]) {
                current.add(s.substring(start, end + 1));
                backtrack(s, end + 1, dp, current, result);
                current.remove(current.size() - 1); // backtrack
            }
        }
    }
}