package W3A1Q4;

class Directory {
	String name;
	long pno; // Phone number
	Directory next;

	public Directory(String name, long pno) { // Initialize values
		this.name = name;
		this.pno = pno;
		
	}

	// -------------------------------------------------------------
	public void displayDirectory() // display values of single element
	{
		System.out.println("Name : " + this.name + " Phone : " + pno);
	}
}

class DirectoryOpr {
	private Directory first; // ref to first Directory
	private Directory last; // ref to last Directory
	int size;

	// -------------------------------------------------------------
	public DirectoryOpr() // constructor
	{
		this.first = null;
		this.last = null;
		size = 0;
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if no Directory in your list
	{
		if(this.last == null && this.first == null)
			return true;
		else
			return false;
	}

	// -------------------------------------------------------------
	public void insertFirst(String name, long pno) // insert at front of list
	{
		Directory d = new Directory(name, pno);
		if(this.first == null){
			this.first = d;
			this.last = this.first;
		}
		else
		{
			d.next = this.first;
			this.first = d;
		}
		size++;
		
		
	}

	// -------------------------------------------------------------
	public void insertLast(String name, long pno) // insert at end of list
	{
		Directory d = new Directory(name, pno);
		if(this.last == null){
			this.last = d;
			this.first = this.last;
		}
		else if(this.first == this.last){
			this.first.next = d;
			this.last = d;
		}
		else
		{
			this.last.next = d;
			d.next = null;
			this.last = d;
		
		}
		size++;
		
	}

	// -------------------------------------------------------------
	public Directory deleteFirst() // delete first Directory
	{	
		Directory d = this.first;
		this.first = this.first.next;
		size--;
		return d;
	}
// -------------------------------------------------------------
	public int size() {
		return size;
	}
// -------------------------------------------------------------
	public void displayList() {
		Directory temp = this.first;
		while(temp != null){
			temp.displayDirectory();
			//System.out.println(temp);
			temp = temp.next;
		}
	}
// -------------------------------------------------------------
	public Directory find(String key)      // find link with given key
    {
		Directory d = new Directory("",0);
		return d;
  	}
 }
