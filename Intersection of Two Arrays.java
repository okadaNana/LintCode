public class Solution {
    /**
     * @param nums1 an integer array
     * @param nums2 an integer array
     * @return an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        
        Set<Integer> nums1Set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }
        
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (nums1Set.contains(nums2[i]) && !resultSet.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }
        
        int[] resultArray = new int[resultSet.size()];
        int i = 0;
        for (Integer num : resultSet) {
            resultArray[i] = num;
            i++;
        }
        return resultArray;
    }
}
