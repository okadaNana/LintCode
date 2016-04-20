public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Empty array
        if (digits.length == 0) {
            return digits;
        }
        
        if (digits.length == 1) {
            int result = digits[0] + 1;
            
            if (result <= 9) {
                digits[0] += 1;
                return digits;
            }
            
            int[] arr = new int[2];
            arr[0] = result / 10;
            arr[1] = result % 10;            
            return arr;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        long resultNum = Long.parseLong(sb.toString());
        resultNum += 1;
        String resultStr = String.valueOf(resultNum);
        int[] arr = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            arr[i] = resultStr.charAt(i) - '0';
        }
        return arr;
    }
}
