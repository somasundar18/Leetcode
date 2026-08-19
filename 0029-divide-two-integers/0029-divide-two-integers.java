class Solution {
    public int divide(int dividend, int divisor) {
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long count = 0;
        while(a >= b){
            long value = b;
            long multiple = 1;
            while(value + value <= a){
                value += value;
                multiple += multiple;
            }
            count += multiple;
            a -= value;
        }
        if(negative){
            count = -count;
        }
        else if(count > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int) count;
    }
}