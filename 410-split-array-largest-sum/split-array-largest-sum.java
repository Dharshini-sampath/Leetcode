class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public boolean canSplit(int[] nums, int k, int maxAllowed) {

        int subarrays = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxAllowed) {

                subarrays++;
                currentSum = num;

                if (subarrays > k) {
                    return false;
                }

            } else {
                currentSum += num;
            }
        }

        return true;
    }
}