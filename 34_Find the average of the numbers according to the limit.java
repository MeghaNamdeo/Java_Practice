/**************************************************************************coeditor and press "Run" button to execute it.
Find the average of the numbers according to the limit

input 
Enter the limit:5
Enter the Array : 1 , 2 ,3 , 4, 5

limit1= 2
limit2= 6

output
4

explain : limit1= arr[2]=3,limit2 = arr[6]=is greate than size so take till length 
                                    =arr[4]=5
Average : 3+4+5/3=12/3=4


*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int size= sc.nextInt();
        System.out.print("Enter the Array : ");
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        System.out.print("Limit1 : ");
         int limit1= sc.nextInt();
        System.out.print("Limit2 : ");
         int limit2= sc.nextInt();
         
        if(limit1<0)limit1=0;
        if(limit2>=size)limit2=size-1;
         int sum=0,count=0;
        for(int i=limit1;i<=limit2;i++)
        {
            sum=sum+arr[i];
            count++;
        }
        System.out.print("Average :"+ sum/count);
        
    }
}
