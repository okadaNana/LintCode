/*
 * Solution 1
 */
public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return digits;
        }

        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i-1] += 1;
            } else {
                return digits;
            }
        }
        
        if(digits[0] == 10){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            result[1] = 0;
            for(int i = 2; i < result.length-1; i++){
                result[i] = digits[i - 1];
            }
            return result;
        } else {
            return digits;
        }
    }
}


/*
 * Solution 2
 */
public class Solution {
    /**
     * @param digits a number represented as an array of digits
     * @return the result
     */
    public int[] plusOne(int[] digits) {
        // Empty array
        if (digits == null || digits.length == 0) {
            return digits;
        }

        // One digit
        if (digits.length == 1) {
            digits[0] += 1;

            if (digits[0] <= 9) {
                return digits;
            } else {
                int[] arr = {digits[0] / 10, digits[0] % 10};
                return arr;
            }
        }

        // More than one digit
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
