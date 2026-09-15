class Solution {
    public int[] shortestToChar(String s, char c) {
        int [] arr = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            int left = i;
            int right = i;
            int prev = Integer.MAX_VALUE;
            while(left >= 0 || right <= s.length() - 1){
                boolean found = false;
                if(left >= 0 && s.charAt(left) == c){
                    prev = Math.min(prev, Math.abs(i - left));
                    found = true;
                }
                if(right < s.length() && s.charAt(right) == c){
                    prev = Math.min(prev, Math.abs(i - right));
                    found = true;
                }
                left--;
                right++;
                if(found) break;
            }
            arr[i] = prev;
        }
        return arr;
    }
}