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
        
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
