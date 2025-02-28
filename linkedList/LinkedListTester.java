package linkedList;

public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList theList = new LinkedListImpl();
		runTests(theList);

	}

	public static void runTests(LinkedList l) {
		l.addItem("Sam");
		l.listItems();
		System.out.println(l.isItemInList("Sam"));
		l.deleteItem("Sam");
		l.addItem("Pam");
		l.addItem("Billy");
		l.addItem("Bob");
		l.addItem("E");
		l.addItem("Jo");
		l.deleteItem("Jo");
		l.addItem("k");

		System.out.println("List contents:");
		System.out.println(l.itemCount());
		l.listItems();

		l.insertBefore("PJ", "Billy");
		l.insertAfter("Daniel", "Billy");
		l.sort();
		System.out.println("List contents after Editing:");
		System.out.println(l.itemCount());
		l.listItems();


	}
}
