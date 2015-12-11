package W3A2Q1;



public class MyPriorityQueue {// need to check the implemented methods.
	Node header;
	
	int size;

	MyPriorityQueue() {
		header = null;
		this.size = 0;
	}

	

// Implement the code

	public void add(String item) {
		if(header == null){
			Node n = new Node(null,item,null);
			header = n;
		}
		else
		{
			Node temp = header;			
			boolean nodeInserted = false;
			while(temp != null){				
				if(temp.value.compareTo(item) >= 0){
					Node newNode= new Node(temp.previous,item,temp);
					if(temp.previous != null){
						temp.previous.next = newNode;
						temp.previous = newNode;
					}
					else{
						temp.previous = newNode;
						header = newNode;			
					}
								
					break;
				}
				else if(temp.next == null){
					Node newNode= new Node(temp,item,null);
					temp.next = newNode;					
					break;
				}
				else{
					temp = temp.next;
				}
						
			}		
			
		}
		this.size++;
		
	}


	public void peek(){
		if(header != null)
			System.out.println(header);
	}
// implement the code

       public int Size(){
    	   return this.size;
       }

// implement code
    public boolean isEmpty()
	{
    	return (header == null);
	}  
	
	
	

	
	public void deleteNode(Node n) {
		if (header != null && n != null) {
			if (n.next == null && n.previous == null) {
				// only one node
				header = null;
				n = null;
				System.out.println("I am here 1");

			} else if (n.previous == null) {
				// remove first node
				n.next.previous = null;
				header = n.next;
				n = null;
				System.out.println("I am here 2");
			} else if (n.next == null) {
				// remove last node
				n.previous.next = null;
				n = null;
				System.out.println("I am here 3");
			} else {
				// general case
				n.next.previous = n.previous;
				n.previous.next = n.next;
				n = null;
				System.out.println("I am here 4");
			}

		}

	}

	

	
	public void remove(){
		
		if(header != null){
			Node temp = header;
			header = header.next;
			header.previous = null;
			temp.next = null;
		}
		
	}


	public String toString() {
		String str =""; 
		Node temp = header;
		while (temp != null) {
			str = str + "-->[" + temp.value.toString() + "]";
			temp = temp.next;
		}
		str = str + "-->[" + "NULL" + "]";
		return str;
	}

	
	
	public class Node {
		String value;
		Node next;
		Node previous;

		Node(Node previous, String value, Node next) {
			this.previous = previous;
			this.value = value;
			this.next = next;
		}

		public String toString() {
			return value;
		}
	}

	public static void main(String[] args) {
		MyPriorityQueue mypq = new MyPriorityQueue();
		
		mypq.add("miki");
		System.out.println(mypq);
		mypq.add("yared");
		System.out.println(mypq);
		mypq.add("abebe");
		System.out.println(mypq);
		mypq.add("zeleke");
		System.out.println(mypq);
		mypq.add("tesfaye");
		System.out.println(mypq);
		mypq.add("bekele");
		System.out.println(mypq);
		mypq.add("chala");
		System.out.println(mypq);
		mypq.add("worke");		
		System.out.println(mypq);
		mypq.remove();
		System.out.println(mypq);
		mypq.peek();
		
		
	}

}

