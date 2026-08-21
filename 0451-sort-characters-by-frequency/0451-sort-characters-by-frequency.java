class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> li = new ArrayList<>(mp.entrySet());
        li.sort((a, b) -> b.getValue() - a.getValue());
        String ans = "";
        for(Map.Entry<Character, Integer> entry : li){
            int len = entry.getValue();
            while(len > 0){
                ans += entry.getKey();
                len--;
            }
        }
        return ans;
    }
}