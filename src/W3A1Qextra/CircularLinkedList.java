package W3A1Qextra;



public class CircularLinkedList {

	Node head;
	Node tail;
	int size;
	public CircularLinkedList() {
		head = null;
		tail = null;
		size = 0;
				
	}
	public void addFirst(int data) // insert at front of list
	{
		Node n = new Node(data);
		if(this.head == null){
			this.head = n;
			this.tail = this.head;
			this.head.next = this.tail;
			this.tail.next = this.head;
			
		}
		else
		{
			n.next = this.head;
			this.head = n;
		}
		size++;
		
		
	}
	
	public void addLast(int data) // insert at end of list
	{
		Node n = new Node(data);
		if(this.tail == null){
			this.tail = n;
			this.tail.next = this.head;
			
		}
		else if(this.head == this.tail){
			this.head.next = n;
			this.tail = n;
			this.tail.next = this.head;
		}
		else
		{
			this.tail.next = n;
			n.next = this.head;
			this.tail = n;
		
		}
		size++;
		
	}
	
	public void displayList() {
		Node temp = this.head;
		if(temp != null)
		do{
			temp.displayNode();
			//System.out.println(temp);
			temp = temp.next;
		
		}while(temp != this.head);
	}
	
	public int getSize(){
		return size;
	}
	public boolean isEmpty() // true if no Directory in your list
	{
		if(this.tail == null && this.head == null)
			return true;
		else
			return false;
	}
	
	public Node deleteFirst() // delete first Node
	{	
		Node d = this.head;
		this.head = this.head.next;
		this.tail.next = this.head;
		
		size--;
		return d;
	}
	
	
	
	class Node{
		int data;
		//Node prev;
		Node next;
		
		Node(int x){
			this.data = x;
		}
		
		public void displayNode() // display values of single element
		{
			System.out.println("Data : " + this.data);
		}
	}
	
	public static void main(String[] args) {
		CircularLinkedList cl = new CircularLinkedList();
		cl.addFirst(4);
		cl.addFirst(5);
		cl.addFirst(6);
		
		cl.addLast(7);
		cl.addLast(8);
		cl.addLast(9);
		System.out.println("Displaying the circular linked list data of ints using single linked list");
		cl.displayList();
		cl.deleteFirst();
		System.out.println("Displaying the circular linked list after deleting the first elem");
		cl.displayList();
		

	}

}
