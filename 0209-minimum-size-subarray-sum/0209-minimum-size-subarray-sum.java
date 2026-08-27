class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                mini = Math.min(mini, i - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}