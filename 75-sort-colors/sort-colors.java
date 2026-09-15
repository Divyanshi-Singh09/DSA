class Solution {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            // Case 1: if mid has 0
            if (nums[mid] == 0) {

                // swap nums[mid] with nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }

            // Case 2: if mid has 1
            else if (nums[mid] == 1) {

                mid++;
            }

            // Case 3: if mid has 2
            else {

                // swap nums[mid] with nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
