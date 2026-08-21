class Solution {
    public String getSmallestString(String s) {
        int left = 0;
        int right = 1;
        char [] a = s.toCharArray();
        while(right < s.length()){
            if(a[left] % 2 == a[right] % 2){
            if(a[left] > a[right]){
                char t = a[left];
                a[left] = a[right];
                a[right] = t;
                break;
            }
            }
            left++;
            right++;
        }
        return new String(a);
    }
}