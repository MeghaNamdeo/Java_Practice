/******************************************************************************
anagram string
Sample Input 0

anagram
margana
Sample Output 0


*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s= sc.nextLine();
	String s2=sc.nextLine();
	char characterArray1[]= s.toCharArray();
	char characterArray2[]= s2.toCharArray();
	
	Arrays.sort(characterArray1);
	Arrays.sort(characterArray2);
	
	if(Arrays.equals(characterArray1,characterArray2))
	System.out.println("Yes");
	else
	System.out.println("No");
	
	}
}
