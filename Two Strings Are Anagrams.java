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

        Map<Character, Integer> mapS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer frequencyCount = mapS.get(s.charAt(i));
            if (null == frequencyCount) {
                mapS.put(s.charAt(i), 1);
            } else {
                mapS.put(s.charAt(i), frequencyCount + 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            Integer frequencyCount = mapS.get(t.charAt(i));
            if (null == frequencyCount) {
                return false;
            } else {
                if (frequencyCount == 0) {
                    return false;
                } else {
                    mapS.put(t.charAt(i), frequencyCount - 1);
                }
            }
        }
        return true;
    }
};
