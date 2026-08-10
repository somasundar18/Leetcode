class Solution {
    public int[] leftRightDifference(int[] nums) {
        int [] leftSum = new int [nums.length];
        int [] rightSum = new int [nums.length];
        int lSum = 0;
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            int t = lSum;
            lSum += nums[i];
            leftSum[i] = t;
        }
        for(int i = nums.length - 1; i >= 0; i--){
            int t = rSum;
            rSum += nums[i];
            rightSum[i] = t;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return nums;
    }
}