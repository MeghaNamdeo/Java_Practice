/******************************************************************************
Perfect Numbers
Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.

Input:
N = 10
Output:
0
Explanation:
Factors of 10 are 1, 2, 5 and 10.
Excluding 10 their sum is 8 which
is not equal to N itself. So, it's
not a Perfect Number.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
	
		int sum=0;
		
		for(int i=1;i*i<=n;i++)
		{
		    if(n%i==0)
		    {
		        sum=sum+i;
		        if(i*i!=n)
		        {
		            sum = sum + n/i;
		            
		        }
		    }
		}
		sum=sum-n;
		if(sum==n)
		{
		    System.out.println(1);
		}
		else{
		     System.out.println(0);
		}
		
	}
}
