/******************************************************************************

Write main method in the Solution class. a methodIn the main five values for an integer array . 
The main method should  print the sum of odd numbers from the array 
of integers only if the sum value is greater than 8 and less else it should print "NA"
for example n, if the values are 1 , 2, 3, 5 , 7 the sum of odd numbers 
should be print as 16
As in the array 1,3,5,7, are odd number so their sum is 16(!+2+5+7 which is graeter than8


input 2: if two number 11 and -18 sum = -7 print NA


*******************************************************************************/
import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
      
        System.out.println("Size : ");
        int n = sc.nextInt();
        
        int  arr[]=new int [n];
        System.out.println("Array : ");
       for(int i =0;i<n ;i++)
       {
           arr[i]=sc.nextInt();
       }
        
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 != 0)
            {
                sum = sum + arr[i];
                
              
            }
        }
        if(sum>8)
        System.out.println("Sum : " + sum);
        else 
        System.out.println("NA");
      
    }
}