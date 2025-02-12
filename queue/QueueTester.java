package queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue theQueue = new QueueImpl();
		runTests(theQueue);

	}
	public static void runTests(Queue q) {
		q.deQueue();
		q.isEmpty();
		q.peek();
		q.enQueue("Sam");
		q.enQueue("Pam");
		q.enQueue("Billy");
		q.enQueue("Bob");
		q.enQueue("E");
		q.enQueue("Jo");
		q.deQueue();
		q.enQueue("k");
		
		q.peek();
		
		
	}

}
