package stack;

import java.util.Arrays;

public class StackImpl implements Stack {
	private String[] stack;
	private int top;
	private int capacity;

	public StackImpl(int capacity) {
		this.capacity = capacity;
		this.stack = new String[capacity];
		this.top = -1;
	}

	@Override
	public void push(String s) {
		if (isFull()) {
			System.out.println("Stack is full. Cannot push.");
			return;
		}
		stack[++top] = s;
		System.out.println("Pushed: " + s);
	}

	@Override
	public String pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
			return null;
		}
		return stack[top--];
	}

	@Override
	public Boolean isEmpty() {
		return top == -1;
	}

	@Override
	public Boolean isFull() {
		return top == capacity - 1;
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public String peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Nothing to peek.");
			return null;
		}
		return stack[top];
	}

	@Override
	public void setCapacity(int size) {
		this.capacity = size;
		stack = Arrays.copyOf(stack, size);
	}

	@Override
	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return;
		}
		System.out.println("Stack contents: ");
		for (int i = top; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
