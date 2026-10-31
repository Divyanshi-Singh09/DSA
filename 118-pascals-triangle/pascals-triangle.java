
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        // Outer loop: creates each row
        for (int i = 0; i < numRows; i++) {

            List<Integer> currentRow = new ArrayList<>();

            // First element is always 1
            currentRow.add(1);

            // Calculate middle elements
            for (int j = 1; j < i; j++) {

                int value = result.get(i - 1).get(j - 1)
                          + result.get(i - 1).get(j);

                currentRow.add(value);
            }

            // Last element is always 1
            if (i > 0) {
                currentRow.add(1);
            }

            // Add completed row to result
            result.add(currentRow);
        }

        return result;
    }
}
