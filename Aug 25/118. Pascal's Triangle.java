import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(numRows);

        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>(r + 1);
            row.add(1);

            if (r > 0) {
                List<Integer> prevRow = triangle.get(r - 1);
                
                for (int c = 1; c < r; c++) {
                    row.add(prevRow.get(c - 1) + prevRow.get(c));
                }
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}