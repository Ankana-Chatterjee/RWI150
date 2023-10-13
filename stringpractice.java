package practice;

import java.util.Scanner; 
public class stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner scanner = new Scanner(System.in);
		        String Str = scanner.nextLine();
		        char[] arr = Str.toCharArray();
		                 
		        String rev = "";
		   
		 for(int i = Str.length() - 1; i >= 0; i--)
		 {
		 rev = rev + Str.charAt(i);
		 }
		  
		 System.out.println(rev);
		 scanner.close();
	}

}
