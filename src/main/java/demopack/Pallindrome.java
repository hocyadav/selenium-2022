package demopack;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		String inputstr,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		inputstr=sc.nextLine();
		char ar[]=inputstr.toCharArray();
		for(int i=inputstr.length()-1;i>=0;i--)
		{
			reverse=reverse+ar[i];
		}
		
		if(inputstr.equals(reverse))
		{
			System.out.println("Entered string is Pallindrome");
		}
		else
		{
			System.out.println("Entered string is not Pallindrome");
		}
	}

}
