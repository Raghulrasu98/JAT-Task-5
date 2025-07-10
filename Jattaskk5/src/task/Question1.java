package task;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("enter the string :");
		
		String input= Scanner.nextLine();
		
		boolean ispalindrome = true;
		
		for  (int i=0; i < input.length() ; i++ ) {
			if (input.charAt(i) != input.charAt(input.length() -1-i )) {
				ispalindrome=false;
				break;
				
			}
			
		}
		if(ispalindrome) {
			System.out.println("given string is a palindrome");
		}
				else { 	System.out.println("given string is not a palindrome");
			
			
		}
	}

}
