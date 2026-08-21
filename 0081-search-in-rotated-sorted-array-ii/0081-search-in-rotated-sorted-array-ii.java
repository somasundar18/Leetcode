class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = 0;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left  = mid + 1;
            }
            else{
                right = mid;
            }
        }
        boolean found = false;
        while(left < nums.length){
            if(target == nums[left]){
                return true;
            }
            left++;
        }
        return false;
    }
}