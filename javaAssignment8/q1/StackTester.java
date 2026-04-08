package javaAssignment8.q1;

import java.util.Scanner;

public class StackTester {

	public static int menulist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 -- Choose Fixed Stack");
		System.out.println("2 -- Choose Growable Stack");
		System.out.println("3 -- Push Employee");
		System.out.println("4 -- Pop Employee");
		System.out.println("5 -- Exit");
		System.out.println("6 -- Display");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = null;
		int choice;
		boolean flag = false;
		while (!flag) {
			choice = menulist();
			switch (choice) {
			case 1: {
				if (stack == null) {
					stack = new FixedStack();
					System.out.println("Fixed Stack Selected  :");
				} else {
					System.out.println("stack already selected ");
				}
				break;
			}
			case 2: {
				if (stack == null) {
					stack = new GrowableStack();
					System.out.println("Growable Stack Selected  :");
				} else {
					System.out.println("stack already selected ");
				}
				break;
			}
			case 3: {
				if (!stack.isFull()) {
					System.out.println("Enter EmpId : ");
					int empId = sc.nextInt();
					System.out.println("Enter Name : ");
					String name = sc.next();
					System.out.println("Enter Salary : ");
					double salary = sc.nextDouble();
					Employee emp = new Employee(empId, name, salary);
					stack.push(emp);
					System.out.println("employee added");
				} else {
					System.out.println("stack is full");
				}
				break;
			}
			case 4: {
				if (stack == null) {
					System.out.println("NO stack chosen !!!");
				} else {
					Employee e = stack.pop();
					if (e != null)
						System.out.println("Popped: " + e);
				}
				break;
			}
			case 5: {
				flag = true;
				System.out.println("Exit");
				break;
			}
			case 6: {
				stack.display();
				break;
			}
			default: {
				System.out.println("Invalid Choice : ");
				break;
			}
			}
		}
	}
}
