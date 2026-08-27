class Solution {
    HashSet<Integer> cols = new HashSet<>();
    HashSet<Integer> posD = new HashSet<>();
    HashSet<Integer> negD = new HashSet<>();
    List<List<String>> res = new ArrayList<>();
    char[][] chess;

    void backtrack(int r, int n){
        if(r == n){
            List<String> copy = new ArrayList<>();
            for(int i = 0; i < n; i++){
                copy.add(new String(chess[i]));
            }
            res.add(copy);
            return;
        }
        for(int c = 0; c < n; c++){
            if(cols.contains(c) || posD.contains(r + c) || negD.contains(r - c)){
                continue;
            }
            chess[r][c] = 'Q';
            cols.add(c);
            posD.add(r + c);
            negD.add(r - c);
            backtrack(r + 1, n);
            chess[r][c] = '.';
            cols.remove(c);
            posD.remove(r + c);
            negD.remove(r - c);
        }
    }
    
    public int totalNQueens(int n) {
        chess = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                chess[i][j] = '.';
            }
        }
        backtrack(0, n);
        return res.size();
    }
}