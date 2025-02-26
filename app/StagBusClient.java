package app;
 
import linkedList.LinkedList;
import linkedList.LinkedListImpl;
import queue.Queue;
import queue.QueueImpl;
import stack.Stack;
import stack.StackImpl;

public class StagBusClient {

	public static void main(String[] args) {
		// create implementation, then

		System.out.println("-----L I S T  T E S T------");
		
		//listRunTestMethod...
 		
		System.out.println("-----S T A C K  T E S T------");
		Stack stackTester = new StackImpl(10);

		stackTester.push("Alice");
		stackTester.push("Bob");
		stackTester.push("Charlie");
		stackTester.push("David");
		stackTester.push("Eve");
		stackTester.push("Frank");

		stackTester.display();

		// Peek at the stack
		System.out.println("Peek: " + stackTester.peek());

		// Remove (pop) the top of the stack
		System.out.println("Popped: " + stackTester.pop());

		stackTester.display();

		// Peek at the stack
		System.out.println("Peek: " + stackTester.peek());

		// 2 more riders
		stackTester.push("Grace");
		stackTester.push("Hank");

		// Peek at the stack
		System.out.println("Peek: " + stackTester.peek());

		// Remove all
		while (!stackTester.isEmpty()) {
			System.out.println("Popped: " + stackTester.pop());
		}

		System.out.println("Is stack empty? " + stackTester.isEmpty());

	 
		System.out.println("----Q U E U E  T E S T-------");
		

		//StackRunTestMethod...
		
	 	}

}
