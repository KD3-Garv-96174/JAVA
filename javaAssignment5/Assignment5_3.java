package javaAssignment5;

import java.util.Scanner;

public class Assignment5_3 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String  : ");
		String str = sc.nextLine();
		String trimmed = str.replace(" ", "");
		int cnt = 0 ;
		System.out.println();
		for(int i = 0 ; i < trimmed.length() ;i++) {
			cnt++;
		}
		System.out.println("Count : " + cnt );
	}
}
