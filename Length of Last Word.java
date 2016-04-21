public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        
        int wordStart = -1;
        int wordLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                wordLen++;
            } else {
                if (i != s.length() -1) {
                    wordLen = 0;
                }
            }
        }
        return wordLen;
     }
}
