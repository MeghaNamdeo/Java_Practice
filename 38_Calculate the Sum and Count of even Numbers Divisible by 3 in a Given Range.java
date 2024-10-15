/******************************************************************************

Calculate the Sum and Count of Even Numbers Divisible by 3 in a Given Rangeange     

input
a=12
b=100

ouput 
sum=810
count=15


*******************************************************************************/

import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("a : ");
        int a = sc.nextInt();
        
        System.out.print("b : ");
        int b = sc.nextInt();
        
        int sum=0,count=0;
        
        for(int i = a ; i <= b;i++)
        {
            if(i%3==0&&i%2==0)
            {
                sum=sum+i;
                count++;
            }
        }
        
        System.out.println("Sum : "+sum);
        System.out.print("Count : "+count);
    }
}
