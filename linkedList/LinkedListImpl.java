package linkedList;

public class LinkedListImpl implements LinkedList {


	private ListItem head = null;
	private int count = 0;
	@Override
	public Boolean isItemInList(String thisItem) {
        ListItem current = head;
        while (current != null) {
            if (current.data.equals(thisItem)) {
                return true;
            }
            current = current.next;
        }		return false;
	}

	@Override
	public Boolean addItem(String thisItem) {
        ListItem newItem = new ListItem(thisItem);
        if (head == null) {
            head = newItem;
        } else {
            ListItem current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newItem;
        }
        count++;
        return true;
    }

	@Override
	public Integer itemCount() {
		return count;
	}

	@Override
	public void listItems() {
		ListItem current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }		
	}

	@Override
	public Boolean deleteItem(String thisItem) {
        if (head == null) return false;
        if (head.data.equals(thisItem)) {
            head = head.next;
            count--;
            return true;
        }
        ListItem current = head;
        while (current.next != null && !current.next.data.equals(thisItem)) {
            current = current.next;
        }
        if (current.next == null) return false;
        current.next = current.next.next;
        count--;
        return true;
    }

	@Override
	public Boolean insertBefore(String newItem, String itemToInsertBefore) {
        if (head == null) return false;
        if (head.data.equals(itemToInsertBefore)) {
            ListItem newNode = new ListItem(newItem);
            newNode.next = head;
            head = newNode;
            count++;
            return true;
        }
        ListItem current = head;
        while (current.next != null && !current.next.data.equals(itemToInsertBefore)) {
            current = current.next;
        }
        if (current.next == null) return false;
        ListItem newNode = new ListItem(newItem);
        newNode.next = current.next;
        current.next = newNode;
        count++;
        return true;
	}

	@Override
	public Boolean insertAfter(String newItem, String itemToInsertAfter) {
        ListItem current = head;
        while (current != null && !current.data.equals(itemToInsertAfter)) {
            current = current.next;
        }
        if (current == null) return false;
        ListItem newNode = new ListItem(newItem);
        newNode.next = current.next;
        current.next = newNode;
        count++;
        return true;
	}

	@Override
	public void sort() {
		if (head == null || head.next == null) return;
		boolean swapped = true; 
		while (swapped) {
			swapped = false;
			ListItem current = head;
			while (current.next != null) {
				if (current.data.compareTo(current.next.data) > 0) {
					String temp = current.data;
					current.data = current.next.data;
					current.next.data = temp;
					swapped = true;
				}
				current = current.next;
			}
		}
	}
	
	
}
