class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        int pivot = left;
        if(pivot == 0){
            left = 0;
            right = nums.length - 1;
        }
        else if(target >= nums[0] && target <= nums[pivot - 1]){
             left = 0;
             right = pivot - 1;
        }
        else{
            left = pivot;
            right = nums.length - 1;
        }
         while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}