package javaAssignment;
import java.util.Scanner;

public class Assignment1_1 {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		String str = Integer.toBinaryString(num);
		System.out.println("Binary Equivalent : " + str);
		String str1 = Integer.toOctalString(num);
		System.out.println("Octal Equivalent : " + str1);
		String str2 = Integer.toHexString(num);
		System.out.println("Hexadecimal Equivalent : " + str2);
	}
}
