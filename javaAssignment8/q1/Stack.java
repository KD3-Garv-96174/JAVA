package javaAssignment8.q1;

public interface Stack {
	int STACK_SIZE = 2;

	void push(Employee emp);

	Employee pop();

	void display();

	boolean isFull();
}