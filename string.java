package practice;

import java.util.Scanner;

		public class string {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("enter any String");
				String s1=sc.nextLine();
				int index1=s1.charAt(0);
				int index2=s1.charAt(6);
				System.out.println("the char value at 0 is"+(char)index1);
				System.out.println("the char value at 6 is"+(char)index2);
				sc.close();

			}
}