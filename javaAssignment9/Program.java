package javaAssignment9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static Scanner sc = new Scanner(System.in);
	public static List<Students> stulist = new ArrayList<>();

	public static int menulist() {
		System.out.println("Menulist : ");
		System.out.println("1. Add Students");
		System.out.println("2. Display Student");
		System.out.println("3. Search Student By Roll No ");
		System.out.println("4. Sort Student By Roll No");
		System.out.println("5. Sort Student By Name ");
		System.out.println("6. Sort Student By Marks ");
		int choice = sc.nextInt();
		return choice;
	}

	public static Students acceptStudent() {
		System.out.print("Enter student detail: ");
		System.out.print("Enter Roll No :  ");
		int rollno = sc.nextInt();
		System.out.print("Enter Name : ");
		String name = sc.next();
		System.out.print("Enter Marks : ");
		double marks = sc.nextDouble();
		Students s = new Students(rollno, name, marks);
		return s;
	}

	public static void addStudent(Students s) {
		stulist.add(s);
	}

	public static void printRecord() {
		for (Students st : stulist) {
			System.out.println(st.toString());
		}
	}

	private static Students findByRollNo(int roll) {
		for (Students s : stulist) {
			if (s.getRollNo() == roll) {
				return s;
			}
		}
		return null;
	}

	private static void printStudent(Students s) {
		if (s != null) {
			System.out.println(s.toString());
		} else {
			System.out.println("Student Not Found  :");
		}

	}

	public static void main(String[] args) {
		int choice = 0;
		Comparator<Students> comparator = null;
		while ((choice = menulist()) != 0) {
			switch (choice) {
			case 1: {
				Students s = Program.acceptStudent();
				Program.addStudent(s);
				break;
			}
			case 2: {
				Iterator<Students> itr = stulist.iterator();
				while (itr.hasNext()) {
					Students stu = itr.next();
					System.out.println(stu.toString());
				}
				break;
			}
			case 3: {
				System.out.println("Enter Roll No : ");
				int roll = sc.nextInt();
				Students s = Program.findByRollNo(roll);
				Program.printStudent(s);
				break;
			}
			case 4: {
				comparator = new SortByRollNo();
				stulist.sort(comparator);
				Program.printRecord();
				break;
			}
			case 5: {
				comparator = new SortByName();
				stulist.sort(comparator);
				Program.printRecord();
				break;
			}
			case 6: {
				comparator = new SortByMarks();
				stulist.sort(comparator);
				Program.printRecord();
				break;
			}
			default:
				System.out.println("INVALID CHOICE");
				break;
			}
		}

	}

}
