package demopack;

public class SumofDigit {

	public static void main(String[] args) {
		int nm =68876; 
		int sum=0, m;
		
		while(nm != 0)
		{
			m=nm%10;
			sum=sum+m;
			nm=nm/10;
		}
			System.out.println(sum);
		

	}

}
