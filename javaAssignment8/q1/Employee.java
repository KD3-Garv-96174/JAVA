package javaAssignment8.q1;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[ EmpId: " + empid + ", Name: " + name + ", Salary: " + salary + " ]";
	}
}