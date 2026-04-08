package javaAssignment5;

import java.util.Scanner;

public class Assignment5_1 {
      public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		System.out.println();
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
		    reversed += str.charAt(i);
		}
		System.out.println("original String  : " + str);
		System.out.println("Reversed String  : " + reversed);
	}
}
