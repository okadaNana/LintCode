public class Solution {
    /**
     * @param s : A string
     * @return : A string
     */
    public String reverseWords(String s) {        
        String result = "";
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (!"".equals(word)) {
                    result = word + " " + result;
                }
                word = "";
            } else {
                word += s.charAt(i);
            }
        }
        if (!"".equals(word)) {
            result = word + " " + result;
        }
        return result;
    }
}
