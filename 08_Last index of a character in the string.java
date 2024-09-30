class Solution{
    int LastIndex(String s, char p){
        int ans=-1;
        for(int i = 0 ; i < s.length();i++)
        {
            if(s.charAt(i)==p)
            {
                ans = i;
            }
        }return ans;
    }
}

Input: S = "Geeks", P = 'e'
Output: 2
Explanation: Last index of 'e' 
is 2.