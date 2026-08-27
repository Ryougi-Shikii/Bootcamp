import java.util.Arrays;

class Solution {
    private int[][] memo;

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return helper(grid, 0, 0);
    }

    private int helper(int[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[0].length) {
            return (int) 1e9;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return grid[i][j];
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int right = helper(grid, i, j + 1);
        int down = helper(grid, i + 1, j);

        memo[i][j] = grid[i][j] + Math.min(right, down);
        return memo[i][j];
    }
}