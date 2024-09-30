import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ch=sc.next().charAt(0);
		for(int i =0;i<s.length();i++)
		{
		    if(s.charAt(i)==ch)
		    {
		        System.out.println(i);
		        break;
		    }
		}
		
	}
}
Input: S = "Geeks", P = 'e'
Output: 1
Explanation: first index of 'e' 
is 1