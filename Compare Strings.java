public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        int[] arrA = new int[26];
        
        for (int i = 0; i < A.length(); i++) {
            arrA[A.charAt(i) - 'A']++;
        }
        
        for (int i = 0; i < B.length(); i++) {
            arrA[B.charAt(i) - 'A']--;
            if (arrA[B.charAt(i) - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
