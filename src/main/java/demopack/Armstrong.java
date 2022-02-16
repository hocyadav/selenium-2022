package demopack;

import java.util.Scanner;

import org.apache.commons.math3.exception.MathArithmeticException;



public class Armstrong {

	public static void main(String[] args) {
		int num,sum=0,rem,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=(int) (sum+Math.pow(rem, 3));
			num=num/10;
		}
		 
		if(temp == sum)
		    System.out.println("Number is armstrong:" + sum);
		else
			System.out.println("Number is not armstrong" );
	}

	
	

}
