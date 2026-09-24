class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        Arrays.sort(nums);
        for(int x : nums){
            if(x % 2 == 0) even.add(x);
            else odd.add(x);
        }
        int i = 0;
        for(int x : even){
            nums[i] = x;
            i++;
        }
        for(int x : odd){
            nums[i] = x;
            i++;
        }
        return nums;
    }
}