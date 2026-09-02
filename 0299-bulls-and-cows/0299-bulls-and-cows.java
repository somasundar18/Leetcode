class Solution {
    public String getHint(String secret, String guess) {
        int correct = 0;
        int incorrect = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : secret.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < secret.length(); i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 == ch2){
                correct++;
                hm.put(ch1, hm.get(ch1) - 1);
            }
        }
        for(int i = 0; i < secret.length(); i++){
            char ch1 = secret.charAt(i);
            char ch2 = guess.charAt(i);
            if(ch1 != ch2 && (hm.getOrDefault(ch2, 0) > 0)){
                incorrect++;
                hm.put(ch2, hm.get(ch2) - 1);
            }
        }
        return new String(correct + "A" + incorrect + "B");
    }
}