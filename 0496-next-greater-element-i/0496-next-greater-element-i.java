class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Stack<Integer> st = new Stack<>();
      int [] res = new int[nums1.length];
      HashMap<Integer,Integer> mono = new HashMap<>();
      for(int i = nums2.length - 1; i >= 0; i--){
        while(!st.isEmpty() && nums2[st.peek()] <= nums2[i]){
            st.pop();
        }
        int t = st.isEmpty() ? -1 : nums2[st.peek()];
        mono.put(nums2[i], t);
        st.push(i);
      }  
      int i = 0;
      for(int n : nums1){
        res[i] = mono.get(n);
        i++;
      }
      return res;
    }
}