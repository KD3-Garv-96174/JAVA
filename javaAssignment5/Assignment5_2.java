package javaAssignment5;

import java.util.Scanner;

public class Assignment5_2 {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println();
		String reverse = "";
		for(int i = 0 ; i<str.length() ; i++) {
			reverse = reverse + str.charAt(i);
		}
		if(reverse.equals(reverse)) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("Not A Palindrome");
		}
	}
}
