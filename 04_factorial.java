//first method 
class Solution{
    static long factorial(int N){
        if(N==1||N==0)return N;
        return N*factorial(N-1);
    }
}

//second method
class Solution{
    static long factorial(int N){
        long fac = 1;
        for(int i=0;i<N;i++)
        {
           fac = fac * (N-i) ;
        }
        return fac;
    }
}
//third method