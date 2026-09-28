class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int maxi = 0;
        int cnt = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
                cnt++;
            }
            else if(!st.isEmpty() && ch == ')'){
                st.pop();
                maxi = Math.max(maxi, cnt);
                cnt--;
            }
        }
        return maxi;
    }
}