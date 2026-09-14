class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int left, int right) {

        // Base case
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(nums, left, mid);

        // Sort right half
        mergeSort(nums, mid + 1, right);

        // Merge both sorted halves
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;      // pointer for left part
        int j = mid + 1;   // pointer for right part
        int k = 0;         // pointer for temp array

        // Compare both parts
        while (i <= mid && j <= right) {

            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left part
        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        // Remaining elements of right part
        while (j <= right) {
            temp[k] = nums[j];
            j++;
            k++;
        }

        // Copy temp array back into original array
        for (int x = 0; x < temp.length; x++) {
            nums[left + x] = temp[x];
        }
    }
}