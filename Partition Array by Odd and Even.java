public class Solution {
    /**
     * @param nums: an array of integers
     * @return: nothing
     */
    public void partitionArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        
        int oddIndex = 0;
        int evenIndex = nums.length - 1;
        while (oddIndex < evenIndex) {
            if (nums[oddIndex] % 2 != 0) {
                oddIndex++;
                continue;
            }
            
            if (nums[evenIndex] % 2 == 0) {
                evenIndex--;
                continue;
            }
            
            int temp = nums[oddIndex];
            nums[oddIndex] = nums[evenIndex];
            nums[evenIndex] = temp;
            oddIndex++;
            evenIndex--;
        }
    }
}
