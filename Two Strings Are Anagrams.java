public class Solution {

    public boolean anagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }

        if (s == null || t == null) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        int[] ascii = new int[256];
        for (int i = 0; i < s.length(); i++) {
            ascii[(int) s.charAt(i)]++;
        }
        
        for (int i = 0; i < t.length(); i++) {
            ascii[(int) t.charAt(i)]--;
            if (ascii[(int) t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
};
