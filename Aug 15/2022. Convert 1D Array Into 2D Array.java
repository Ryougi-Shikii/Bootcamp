class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        
        for (int r = 0; r < m; r++) {
            System.arraycopy(original, r * n, result[r], 0, n);
        }

        return result;
    }
}