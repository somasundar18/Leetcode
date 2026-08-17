class Solution {
    public int maxVowels(String s, int k) {
        int gs = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') gs++;
        }
        int c = gs;
        for(int i = k; i < s.length(); i++){
            char ch = s.charAt(i - k);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') gs--;
            char in = s.charAt(i);
            if(in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u') gs++;
            c = Math.max(gs, c);
        }
        return c;
    }
}