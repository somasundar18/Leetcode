class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        ArrayList<Integer> li = new ArrayList<>();
        if(nums1.length > nums2.length){
            for(int x : nums1){
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            for(int i = 0; i < nums2.length; i++){
                if(mp.containsKey(nums2[i]) && mp.get(nums2[i]) > 0){
                    li.add(nums2[i]);
                    mp.put(nums2[i], mp.getOrDefault(nums2[i], 0) - 1);
                }
            }
        }
        else{
            for(int x : nums2){
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            for(int i = 0; i < nums1.length; i++){
                if(mp.containsKey(nums1[i]) && mp.get(nums1[i]) > 0){
                    li.add(nums1[i]);
                    mp.put(nums1[i], mp.getOrDefault(nums1[i], 0) - 1);
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