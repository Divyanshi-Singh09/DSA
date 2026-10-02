class Solution {
    public int findKthPositive(int[] arr, int k) {

        int current = 1;
        int index = 0;

        while (k > 0) {

            if (index < arr.length && arr[index] == current) {
                index++;
            } else {
                k--;
            }

            current++;
        }

        return current - 1;
    }
}