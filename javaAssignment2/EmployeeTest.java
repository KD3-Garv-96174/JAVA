package javaAssignment2;

import java.util.Scanner;

class Employee{
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee() {
		this.firstName = " ";
		this.lastName = " ";
		this.salary = 0.0;
	}
	public Employee(String firstName , String lastName ,double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
	    setSalary(salary);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary < 0) {
			this.salary = 0.0;
		}else {
		this.salary = salary;
		}
	}
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstName : ");
		this.firstName = sc.next();
		System.out.println("Enter lastName : ");
		this.lastName = sc.next();
		System.out.println("Enter salary : ");
		setSalary(sc.nextDouble());
		}
	public void displayRecord() {
		System.out.println("First Name : " + getFirstName());
    	System.out.println("Last Name : " + getLastName());
    	System.out.println("Salary : " + getSalary());
	}
}
public class EmployeeTest {
	
	public static void main(String[] args) {
		 Employee e = new Employee();
		    e.acceptRecord();
		    e.displayRecord();
	}
   
}
