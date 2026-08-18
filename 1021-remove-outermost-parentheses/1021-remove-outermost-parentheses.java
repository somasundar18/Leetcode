class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(st.size() != 0){
                    res += '(';
                }
                st.push('(');
            }
            else{
                st.pop();
                if(st.size() != 0){
                    res += ')';
                }
            }
        }
        return res;
    }
}