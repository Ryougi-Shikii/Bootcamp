class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        
        if (word.length() > m * n) return false;

        int[] boardFreq = new int[128];
        for (char[] row : board) {
            for (char c : row) {
                boardFreq[c]++;
            }
        }
        
        int[] wordFreq = new int[128];
        for (char c : word.toCharArray()) {
            if (++wordFreq[c] > boardFreq[c]) {
                return false;
            }
        }

        if (boardFreq[word.charAt(word.length() - 1)] < boardFreq[word.charAt(0)]) {
            word = new StringBuilder(word).reverse().toString();
        }

        char[] chars = word.toCharArray();
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == chars[0] && dfs(board, r, c, 0, chars)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int r, int c, int idx, char[] word) {
        if (idx == word.length) {
            return true;
        }

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word[idx]) {
            return false;
        }

        char temp = board[r][c];
        board[r][c] = '#';

        boolean found = dfs(board, r + 1, c, idx + 1, word)
                     || dfs(board, r - 1, c, idx + 1, word)
                     || dfs(board, r, c + 1, idx + 1, word)
                     || dfs(board, r, c - 1, idx + 1, word);

        board[r][c] = temp;

        return found;
    }
}