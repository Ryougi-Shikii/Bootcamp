class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        // 8-directional offsets
        int[] dRow = {-1, -1, -1,  0, 0,  1, 1, 1};
        int[] dCol = {-1,  0,  1, -1, 1, -1, 0, 1};

        // Pass 1: Encode state transitions
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int liveNeighbors = 0;

                for (int i = 0; i < 8; i++) {
                    int nr = r + dRow[i];
                    int nc = c + dCol[i];
                    
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n) {
                        // Original state was live if 1 or 2
                        if (board[nr][nc] == 1 || board[nr][nc] == 2) {
                            liveNeighbors++;
                        }
                    }
                }

                // Rule 1 & 3: Live cell dies -> mark as 2
                if (board[r][c] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[r][c] = 2;
                }
                // Rule 4: Dead cell becomes live -> mark as 3
                else if (board[r][c] == 0 && liveNeighbors == 3) {
                    board[r][c] = 3;
                }
            }
        }

        // Pass 2: Final state resolution
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                board[r][c] %= 2; // 0, 2 -> 0; 1, 3 -> 1
            }
        }
    }
}