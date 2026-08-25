class Solution {
    public int missingMultiple(int[] nums, int k) {
       HashSet<Integer> st = new HashSet<>();
       for(int x : nums) st.add(x);
       int n = k;
       while(true){
        if(!st.contains(n)) return n;
        n += k;
       }
    }
}