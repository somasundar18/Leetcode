class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        sub(0, nums, new ArrayList<>());
        return res;
    }

    public void sub(int j, int[] arr, ArrayList<Integer> li) {
        res.add(new ArrayList<>(li));
        for (int i = j; i < arr.length; i++) {
            li.add(arr[i]);
            sub(i + 1, arr, li);
            li.remove(li.size() - 1);
        }
    }
}