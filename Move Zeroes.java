public class Solution {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
    
        // find all non-zero number
        List<Integer> nonZero = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero.add(nums[i]);
            }
        }
        
        // put all non-zero number into array
        for (int i = 0; i < nonZero.size(); i++) {
            nums[i] = nonZero.get(i);
        }
        // put zero to rest place of array
        for (int i = nonZero.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
