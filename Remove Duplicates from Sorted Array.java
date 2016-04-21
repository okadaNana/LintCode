public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        
        if (nums.length == 0) {
            return 0;
        }
        
        if (nums.length == 1) {
            return 1;
        }
        
        List<Integer> list = new ArrayList<>();
        int firstNum = nums[0];
        list.add(firstNum);
        for (int i = 1; i < nums.length; i++) {
            if (firstNum != nums[i]) {
                list.add(nums[i]);
                firstNum = nums[i];
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i < list.size()) {
                nums[i] = list.get(i);
            }
        }
        
        return list.size();
    }
}
