class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> li = new ArrayList<>();
        for(int n : nums1){
            li.add(n);
        }
        for(int n : nums2){
            li.add(n);
        }
        Collections.sort(li);
        if(li.size() % 2 != 0){
           return (double)(li.get(li.size() / 2)); 
        }
        return ((li.get((li.size() / 2) - 1)) + (li.get(li.size() / 2))) / 2.0;
    }
}