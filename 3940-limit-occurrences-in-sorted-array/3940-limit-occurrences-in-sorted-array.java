class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        LinkedHashMap<Integer,Integer> lm = new LinkedHashMap<>();
        for(int x : nums){
            lm.put(x, lm.getOrDefault(x, 0) + 1);
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : lm.entrySet()){
            int n = entry.getValue();
            if(n >= k){
                int l = k;
            while(l >= 1){
                li.add(entry.getKey());
                l--;
            }
            }
            else{
                while(n >= 1){
                    li.add(entry.getKey());
                    n--;
                }
            }
        }
        int [] arr = new int[li.size()];
        int i = 0;
        for(int x : li){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}