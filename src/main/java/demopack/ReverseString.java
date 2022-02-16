package demopack;

public class ReverseString {

	public static void main(String[] args) {
		String actualstr = "Selenium";
		char arr[]=actualstr.toCharArray();
		
		for(int i = 7 ; i >= 0; i--)
		{
			System.out.print(arr[i]);
		}

	}

}
