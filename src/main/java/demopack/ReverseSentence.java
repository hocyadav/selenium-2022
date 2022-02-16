package demopack;

public class ReverseSentence {

	public static void main(String[] args) {
		
     String actstr= "I am in Bangalore";
      String[] words=actstr.split("\\s");
      String outstr="";
    		 
      for(int i = words.length-1;i>=0;i--)
      {
    	  outstr=outstr+words[i] + " ";
      }
      System.out.println("Reversed String :" + outstr);
	}

}
