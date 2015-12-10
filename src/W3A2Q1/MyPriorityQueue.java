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
		else{
			Node temp = header;
			
			boolean nodeInserted = false;
			while(temp.next != null){
				
				switch(temp.value.compareTo(item)){
				case 1:
					temp = temp.next;
					break;
				case 0:
				case -1:
					Node newNode= new Node(temp,item,null);
					temp.next = newNode;
					nodeInserted = true;
					break;
				}
				if(nodeInserted)
					break;
			}		
			
		}
		this.size++;
		
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
		Node temp = header;
		
		while(temp.next != null){
			temp = temp.next;
		}
		Node beforeLast = temp.previous;
		beforeLast.next = null;
		temp.previous = null;
		
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
		mypq.add("yared");
		mypq.add("abebe");
		mypq.add("zeleke");
		
		
		System.out.println(mypq);
		
		
	}

}

