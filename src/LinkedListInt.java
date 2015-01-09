public class LinkedListInt {

	private Node head;
	int size;

	public LinkedListInt() {
		this.head = null;
		size = 0;
	}

	/**
	 * Method which adds new Node in our linked list.
	 * 
	 * @param value
	 *            of new node.
	 */
	public void add(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
			size++;
		} else {

			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);
			size++;
		}

	}

	public String toString() {
		Node current = head;
		String out = "[";

		while (current != null) {
			if (current.getNext() == null) {
				out += current.getValue();
				break;
			}

			out += current.getValue() + ", ";
			current = current.getNext();
		}

		return out + "]";
	}

	public void removeAt(int index) {

		int counter = 0;
		Node current = head;

		if (index == 0) {
			head = head.getNext();
			size--;
		}

		while (counter < index - 1) {
			current = current.getNext();
			counter++;
		}
		Node prev = current;
		Node remove = prev.getNext();
		Node next = remove.getNext();

		prev.setNext(next);
		size--;

	}

	public Node getByIndex(int index) {

		int counter = 0;
		Node current = head;

		while (counter < index) {
			current = current.getNext();
			counter++;
		}
		return current;
	}

	/**
	 * Testing
	 */
	public void deDuplicate() {
		Node current = head;
		int currentIdx = 0;
		
		do {
					
			for (int i = currentIdx +1; i < size; i++) {
				if (current.getValue() == getByIndex(i).value) {
					removeAt(i);
					
				}
			}
			current = current.getNext();
			currentIdx++;

			if(current == null)
				break;
			
		}while(true);

	}

	
	public void deDuplicate1(){
		Node current = head;
		
		while(current != null){
			Node next = current.getNext();
			int counter = 1;
			
			while(next != null){
				if(current.value == next.value){
					removeAt(counter);
					
				}
				counter++;
				next = next.getNext();
				
			}
			current = current.getNext();
		}
		
		
	}
	
	
	
	/**
	 * Private class node that we'll use for making Linked List. Node has int
	 * value.
	 * 
	 * @author vedadzornic
	 *
	 */

	private class Node {
		private int value;
		private Node next;

		/**
		 * Constructor
		 * 
		 * @param value
		 *            int value that we're setting
		 */
		public Node(int value) {
			this.value = value;

		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public String toString() {
			return " " + value;
		}

	}
}
