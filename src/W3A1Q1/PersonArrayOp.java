package W3A1Q1;

class PersonArrayOp
{
	private Person[] a; // reference to array
	private int nElems; // number of data items
	private int size;
	
	public PersonArrayOp(int max) // constructor to initialize person array with size max and nElems;
	{
		this.a = new Person[max];
		this.nElems = 0;
	}

	public Person find(String searchName) // Pass Lastname as an argument
	{ 
		Person q = null;
		for(Person p : a){
			if(p.getLastName().equals(searchName)){
				q = p;
				break;
			}
		}
		return q;
	} 
	
	public void insert(String last, String first, int age)// Insert at last
	{
		if(this.nElems == a.length) resize();
		Person p = new Person(last,first,age);
		a[this.nElems++] = p;
	}
	
	private void resize(){
		System.out.println("Risiaing array");
		int len = a.length;
		if(len == 0 )
			len = 1;
		int newLen = len * 2;
		Person[] temp = new Person[newLen];
		System.arraycopy(a, 0, temp, 0, len);
		a = temp;
		
	}
	public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
	{ 
		boolean found = false;
		int index = -1;
		for(Person p : a){
			if(p.getLastName().equals(searchName)){
				found = true;
				break;
			}
			index++;
		}
		//shift elements in the person array backwards starting from a,
		if(found)
		for(int i = index; i < this.nElems - 1 ; i++){
			a[i] = a[i+1];
		}
		a[this.nElems - 1] = null;
		this.nElems--;
		
		return found;
	}
	public void displayAll() // displays array contents
	{
		for(Person p : this.a)
			if(p != null)
			p.displayPerson();
	}
	public int size() // Return the number of persons stored in the array
	{
		return this.nElems;
	}

	
}

