class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        int delta = a ^ b;
        int count = 0;
        while (delta != 0) {
            count += delta & 1;
            delta = delta >>> 1;    
        }
        return count;
    }
};
