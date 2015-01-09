/**
 * Class which creates linked list.
 * @author Vedad_2
 *
 */
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
	
	/**
	 * To string method which returns our list as string.
	 */
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
	/**
	 * Method which returns node at index sent as parameter.
	 * We're going from first node to node at index-1 ( one before node we want to remove)
	 * Once we got our (index-1) node we set his next to (index+1).
	 * This way we delete all links to our index node.
	 * @param index
	 */
	public void removeAt(int index){
		
		 int counter = 0;
		 Node current= head;
		 
		 while(counter < index-1 && index <= size){  	
			 current = current.getNext();
			 counter++;			 
		 }
		 
		 //[previous]-->[remove]-->[next]
		 Node previous = current;											
		 Node remove = current.getNext();
		 Node next = remove.getNext();
		 
		 //after removing, [previous] --> [next]
		 previous.setNext(next);
		
		size--;										
	}
	
	/**
	 * Method which is going from first node to node at index and returning that node.
	 * @param index
	 * @return
	 */
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
	 * Method which removes all duplicated values in our list.
	 * Each time i found double i remove it and i set counter (i) back to i-1;
	 * Had to make this because if we add 3+ same values in row every 2nd will be skipped.
	 */
	public void deDuplicate() {
		Node current = head;  				//Starting from first
		int currentIdx = 0;  				//setting index of first
		
		do {//Infinity loop, we break it when our current is null.											
					
			for (int i = currentIdx +1; i < size; i++) {	//checking every next node if has same value as one we're checking
				if (current.getValue() == getByIndex(i).value) {
					removeAt(i);  			//Removing double node
					i--;					//Decreasing i ( this way we check if same node is few times in row)									
				}
			}
			current = current.getNext();	//moving current and his index
			currentIdx++;

			if(current == null)		//end once our current is null
				break;
			
		}while(true);

	}

	/**
	 * Method which returns node in middle of our list. 
	 * I couldn't use size value for this method!
	 * @return
	 */
	public Node getMiddleValue(){
		
		int size = 0;
		Node middle = head;
		Node current = head;
		
		while(current != null){
			current = current.getNext();
			size++;
				
		}
		
		for ( int i=0; i<size/2; i++)
			middle = middle.getNext();
		
		
		
		return middle;
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
