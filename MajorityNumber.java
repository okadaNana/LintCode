public class Solution {
    /**
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    public int majorityNumber(ArrayList<Integer> nums) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int k = 0; k < nums.size(); k++) {
                if (nums.get(i).intValue() == nums.get(k).intValue()) {
                    count++;
                }
            }
            if (count > nums.size() / 2) {
                result = nums.get(i);
                break;
            }
        }
        return result;
    }
}
