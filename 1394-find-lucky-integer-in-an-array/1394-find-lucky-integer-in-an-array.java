class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == hm.get(arr[i])){
                return arr[i];
            }
        }
        return -1;
    }
}