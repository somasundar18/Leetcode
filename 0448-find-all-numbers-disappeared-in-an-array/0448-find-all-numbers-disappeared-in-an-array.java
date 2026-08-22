class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int x : nums){
            st.add(x);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(!st.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}