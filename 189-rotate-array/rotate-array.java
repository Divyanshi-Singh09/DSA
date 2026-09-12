class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Step 1: Reverse complete array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int i, int j) {

        while (i < j) {

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
}