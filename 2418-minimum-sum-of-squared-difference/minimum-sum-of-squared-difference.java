
import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2,
                                 int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long k = (long) k1 + k2;
        long total = 0;
        int maxDiff = 0;

        // Step 1: Calculate absolute differences
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            maxDiff = Math.max(maxDiff, diff[i]);
        }

        // Step 2: If all differences can become 0
        if (total <= k) {
            return 0;
        }

        // Step 3: Binary search minimum possible limit
        int low = 0;
        int high = maxDiff;

        while (low < high) {
            int mid = low + (high - low) / 2;

            long operations = 0;

            for (int d : diff) {
                if (d > mid) {
                    operations += d - mid;
                }
            }

            if (operations <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        // Step 4: Reduce differences to low
        long answer = 0;

        for (int d : diff) {
            if (d > low) {
                k -= d - low;
                d = low;
            }

            answer += (long) d * d;
        }

        // Step 5: Use remaining operations
        answer -= k * (2L * low - 1);

        return answer;
    }
}
