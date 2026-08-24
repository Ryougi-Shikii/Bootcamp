import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        k = k % total;
        
        List<List<Integer>> result = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>(n);
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            result.add(row);
        }

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int flatIndex = r * n + c;
                int newFlatIndex = (flatIndex + k) % total;
                int newRow = newFlatIndex / n;
                int newCol = newFlatIndex % n;
                
                result.get(newRow).set(newCol, grid[r][c]);
            }
        }

        return result;
    }
}