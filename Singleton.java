class Solution {
    
    private volatile static Solution instance; 
    
    /**
     * @return: The same instance of this class every time
     */
    public static Solution getInstance() {
        if (null == instance) {
            synchronized (Solution.class) {
                if (null == instance) {
                    instance = new Solution();
                }
            }
        }
        
        return instance;
    }
};
