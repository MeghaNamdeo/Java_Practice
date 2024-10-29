import java.util.*;
public class Solution{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char characterArray[]= s.toCharArray();
        int start=0;
        int end = characterArray.length-1;
        while(start<=end)
        {
            char temp= characterArray[start];
             characterArray[start]= characterArray[end];
             characterArray[end]=temp;
             start++;
             end--;
            
        }
        String reverseString = new String(characterArray);
        if(s.equals(reverseString))
        System.out.println("Yes");
        else
        System.out.println("No");
    
    }
}
