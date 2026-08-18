class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        String res = "";
        for(char ch : st){
            res += ch;
        }
        return res;
    }
}