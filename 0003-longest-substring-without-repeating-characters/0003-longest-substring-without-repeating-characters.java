class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st = new HashSet<>();
        int maxi = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++){
            while(st.contains(s.charAt(i))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(i));
            maxi = Math.max(maxi, i - l + 1);
        }
        return maxi;
    }
}