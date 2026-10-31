
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        // Start with first row
        row.add(1);

        // Generate rows one by one
        for (int i = 1; i <= rowIndex; i++) {

            // Add 1 at the end
            row.add(1);

            // Update middle elements from right to left
            for (int j = i - 1; j > 0; j--) {

                int sum = row.get(j) + row.get(j - 1);

                row.set(j, sum);
            }
        }

        return row;
    }
}
