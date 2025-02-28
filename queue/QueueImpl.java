
package queue;

public class QueueImpl implements Queue {
int Length = 6;
String[] arr = new String[Length];
int size = 0;
	@Override
	public boolean isFull() {
		
		if(arr[Length-1] != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		if(arr[0] == null) {
			return true;
		}
		return false;
	}

	@Override
	public void enQueue(String element) {
		
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			arr[size] = element;
			size++;
		}
	}

	@Override
	public String deQueue() {
		
		if(!isEmpty()) {
			String temp = arr[0];
			for(int i = 1; i < size; i++) {
				arr[i-1] = arr[i];
			}
			arr[size-1] = null;
			size--;
			return temp;
		}
		return null;
	}

	@Override
	public void display() {
		
		for(int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		
	}

	@Override
	public String peek() {
		
		if(!isEmpty()) {
			return arr[0];
		}
		return null;
	}

}
