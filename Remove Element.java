public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        if (A == null) {
            return 0;
        }
        
        if (A.length == 1) {
            return A[0] == elem ? 0 : 1;
        }
        
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem) {
                arr.add(A[i]);
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            A[i] = arr.get(i);
        }
        return arr.size();
    }
}
