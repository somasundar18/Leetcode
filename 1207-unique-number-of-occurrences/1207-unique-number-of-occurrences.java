class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : arr){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        HashSet<Integer> st = new HashSet<>();
        for(HashMap.Entry<Integer,Integer> entry : mp.entrySet()){
            if(st.contains(entry.getValue())){
                return false;
            }
            st.add(entry.getValue());
        }
        return true;
    }
}