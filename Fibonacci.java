class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;            
        }

        int previousOne = 1;  // 前一个
        int previousTwo = 0;  // 前两个
        int result = 0;       // 结果值
        for (int i = 3; i <= n; i++) {
            result = previousOne + previousTwo;
            previousTwo = previousOne;
            previousOne = result;
        }
        return result;
    }
}
