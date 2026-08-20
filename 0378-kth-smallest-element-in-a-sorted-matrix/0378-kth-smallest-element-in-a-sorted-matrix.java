class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int [] num : matrix){
            for(int n : num){
                pq.add(n);
            }
        }
        int ans = 0;
        for(int i = 0; i < k; i++){
            ans = pq.poll();
        }
        return ans;
    }
}