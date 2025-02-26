package stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stackTester = new StackImpl(6);
		stackTester.push("thing in stack");
		runTests(stackTester);
	}
	
	public static void runTests(Stack stack) {
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");

		stack.display();


		System.out.println("Peek: " + stack.peek());


		System.out.println("Popped: " + stack.pop());
		System.out.println("Popped: " + stack.pop());


		System.out.println("Size: " + stack.size());


		System.out.println("Is empty? " + stack.isEmpty());
		System.out.println("Is full? " + stack.isFull());
	}

}
