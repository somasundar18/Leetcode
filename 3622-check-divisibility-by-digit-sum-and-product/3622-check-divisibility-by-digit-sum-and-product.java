class Solution {
    public boolean checkDivisibility(int n) {
        int prod = 1;
        int sum = 0;
        int copy = n;
        while(n != 0){
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return copy % (sum + prod) == 0;
    }
}