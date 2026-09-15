class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        li.add(first);
        if(numRows == 1){
            return li;
        }
        li.add(second);
        for(int i = 2; i < numRows; i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            List<Integer> prev = new ArrayList<>(li.get(i - 1));
            for(int j = 1; j < i; j++){
                l.add(prev.get(j - 1) + prev.get(j));
            }
            l.add(1);
            li.add(l);
        }
        return li;
    }
}