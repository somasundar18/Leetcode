class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while(m <= h){
            int t = 0;
            if(nums[m] == 0){
                t = nums[m];
                nums[m] = nums[l];
                nums[l] = t;
                l++;
                m++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else{
                t = nums[m];
                nums[m] = nums[h];
                nums[h] = t;
                h--;
            }
        }
    }
}