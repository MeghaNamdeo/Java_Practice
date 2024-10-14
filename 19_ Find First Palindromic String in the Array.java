Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
    
Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
    
    class Solution {
    boolean isPalindrome(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)==str.charAt(end))
            {
                start++;
                end--;
            }
            else
            return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPalindrome(words[i]))return words[i];
            
        }return "";
        
    }
}
//TC :O(n*m)
//SC:O(1)
