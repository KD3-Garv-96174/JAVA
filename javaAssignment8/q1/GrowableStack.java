package javaAssignment8.q1;

public class GrowableStack implements Stack {
	private Employee[] stack;
	private int top;

	public GrowableStack() {
		stack = new Employee[STACK_SIZE];
		top = -1;
	}

	@Override
	public void push(Employee emp) {
		if (top == stack.length - 1) {
			Employee[] temp = new Employee[stack.length * 2];
			for (int i = 0; i <= top; i++) {
				temp[i] = stack[i];
			}
			stack = temp;
		}
		stack[++top] = emp;
	}

	@Override
	public Employee pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return null;
		} else {
			return stack[top--];
		}
	}

	@Override
	public void display() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return;
		}
		for (int i = 0; i <= top; i++) {
			System.out.println(stack[i]);
		}
	}

	@Override
	public boolean isFull() {
		return top == STACK_SIZE - 1;
	}
}