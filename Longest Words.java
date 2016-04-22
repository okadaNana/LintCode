class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        int maxLen = 0;
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].length() > maxLen) {
                maxLen = dictionary[i].length();
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < dictionary.length; i++) {
            if (dictionary[i].length() == maxLen) {
                result.add(dictionary[i]);
            }
        }
        return result;
    }
};
