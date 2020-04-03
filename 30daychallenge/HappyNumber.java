class Solution {
    public boolean isHappy(int n) {
        
        long num = n;
        while(true){
            long sum = 0;
        while(num>0){
            long digit = num%10;
            sum += digit*digit;
            num/=10;
        }
        if(sum/10 < 1)
            return (sum == 1 || sum == 7);
        num = sum;
        }
    }
}
