class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int front = 0;
        int tail = nums.length - 1;
        int result = -1;
        while (front <= tail) {
            int center = (front + tail) / 2;
            if (target < nums[center]) {
                tail = center - 1;
            } else if (target == nums[center]) {
                result = center;
                break;
            } else {
                front = center + 1;
            }
        }
        if (-1 == result) {
            return -1;
        } else {
            for (int i = result; i >= 0; i--) {
                if (target > nums[result]) {
                    break;
                }else if (target == nums[i]) {
                    result = i;
                }
            }
            return result;
        }
    }
}
