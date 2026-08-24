class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }
        return 0;
    }
}