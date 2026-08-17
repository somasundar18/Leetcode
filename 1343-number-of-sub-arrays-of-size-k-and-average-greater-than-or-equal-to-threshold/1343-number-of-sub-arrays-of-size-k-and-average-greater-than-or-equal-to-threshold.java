class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cs = 0;
        for(int i = 0; i < k; i++){
            cs += arr[i];
        }
        int cnt = 0;
        if(cs / k >= threshold) cnt++;
        for(int i = k; i < arr.length; i++){
            cs += arr[i] - arr[i - k];
            if(cs / k >= threshold) cnt++;
        }
        return cnt;
    }
}