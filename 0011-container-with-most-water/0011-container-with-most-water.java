class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxi = 0;
        while(l < r){
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            int curr = h * w;
            if(height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }
            maxi = Math.max(curr, maxi);
        }
        return maxi;
    }
}