public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        insertionSort(A);
    }
    
    private void bubbleSourt(int[] A) {
        for (int out = A.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (A[in] > A[in + 1]) {
                    int temp = A[in];
                    A[in] = A[in + 1];
                    A[in + 1] = temp;
                }
            }
        }
    }
    
    private void selectionSort(int[] A) {
        for (int out = 0; out < A.length; out++) {
            int minIndex = out;
            for (int in = out; in < A.length; in++) {
                if (A[in] < A[minIndex]) {
                    minIndex = in;
                }
            }
            
            int temp = A[minIndex];
            A[minIndex] = A[out];
            A[out] = temp;
        }
    }
    
    private void insertionSort(int[] A) {
        for (int out = 1; out < A.length; out++) {
            int marketNum = A[out];
            int in = out;
            while (in > 0 && A[in - 1] >= marketNum) {
                A[in] = A[in - 1];
                in--;
            }
            A[in] = marketNum;
        }
    }
}
