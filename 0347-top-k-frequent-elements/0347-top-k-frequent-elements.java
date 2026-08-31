class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue() >= k){
                li.add(entry.getKey());
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> mp.get(a) - mp.get(b));
        for(int x : mp.keySet()){
            pq.offer(x);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int [] arr = new int[k];
        int i = 0;
        for(int x : pq){
            arr[i] = x;
            i++;
        }
        return arr;
    }
}