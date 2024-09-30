class Solution {
    static int nthFibonacci(int n){
         if (n == 1 || n == 2) 
            return 1;
        
        int a = 1, b = 1, result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        
        return result; 
    }
}


class Solution {
    static final int MOD = 1000000007;
    static int nthFibonacci(int n){
        if(n==0)return 0;
         if (n == 1 || n == 2) 
            return 1;
        
        int a = 1, b = 1, result = 0;
        
        for (int i = 3; i <= n; i++) {
            result = (a + b)%MOD;
            a = b;
            b = result;
        }
        
        return result; 
    }
}