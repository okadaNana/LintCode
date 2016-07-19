public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }
    
        int front = 0;
        int tail = A.length - 1;        
        while (front <= tail) {
            int center = (front + tail) / 2;
            if (target < A[center]) {
                tail = center - 1;
            } else if (target == A[center]) {
                return center;
            } else {
                front = center + 1;
            }
        }
        
        if (tail < 0) {
            return 0;
        } else {
            return tail + 1;
        }
    }
}
