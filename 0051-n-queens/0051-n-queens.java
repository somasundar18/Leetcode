class Solution {
    HashSet<Integer> cols = new HashSet<>();
    HashSet<Integer> postD = new HashSet<>(); //(r + c)
    HashSet<Integer> negD = new HashSet<>(); //(r - c)
    List<List<String>> res = new ArrayList<>();
    char[][] chess;

    void backtrack(int r, int n) {
        //base case
        if (r == n) {
            List<String> copy = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                copy.add(new String(chess[i]));
            }
            res.add(copy);
            return;
        }

        for (int c = 0; c < n; c++) {
            //conditions weather queen is in col,diagonal
            if (cols.contains(c) || postD.contains(r + c) || negD.contains(r - c)) {
                continue;
            }
            cols.add(c);
            postD.add(r + c);
            negD.add(r - c);
            chess[r][c] = 'Q';

            backtrack(r + 1, n);

            cols.remove(c);
            postD.remove(r + c);
            negD.remove(r - c);
            chess[r][c] = '.';
        }
    }

    public List<List<String>> solveNQueens(int n) {
        chess = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = '.';
            }
        }
        backtrack(0, n);
        return res;
    }
}