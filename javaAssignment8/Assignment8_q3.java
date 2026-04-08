package javaAssignment8;

import java.util.ArrayList;

public class Assignment8_q3 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<>();
		number.add(1);
		number.add(3);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		number.add(9);
		System.out.println("original list : " + number);
		number.set(1, 2);
		System.out.println("updated list : " + number);
	}
}
