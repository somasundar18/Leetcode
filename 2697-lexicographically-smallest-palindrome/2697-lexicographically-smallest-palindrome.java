class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char [] a = s.toCharArray();
        while(left < right){
            if(a[left] != a[right]){
                if(a[left] < a[right]){
                    a[right] = a[left];
                }
                else{
                    a[left] = a[right];
                }
            }
            left++;
            right--;
        }
        String ans = "";
        for(char ch : a){
            ans += ch;
        }
        return ans;
    }
}