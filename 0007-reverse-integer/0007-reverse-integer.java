class Solution {
    public int reverse(int x) {
        long n = 0;
        int m = x;
        if(x < 0){
            x=x*-1;
        }
        while(x > 0){
           int rem = x % 10;
           n =  n*10 + rem;
           x = x/10;
        }
        if(n > 2147483647 || n <-2147483648){
            return 0;}
        if(m>0){
            return (int)n;
        }
        else{
            return (int)n*-1;
        }
    }
}