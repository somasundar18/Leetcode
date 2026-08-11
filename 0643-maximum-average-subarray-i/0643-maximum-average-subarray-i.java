class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double gs = 0;
        for(int i = 0; i < k; i++){
            gs += nums[i];
        }
        double cs = gs;
        for(int i = k; i < nums.length; i++){
            cs += nums[i] - nums[i - k];
            gs = Math.max(gs, cs);
        }
        return gs / k;
    }
}