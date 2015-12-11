package W3A2Q2;

public class QueueArray {
	Object[] a;
	int size;
	int capacity = 4;// can be any number
	
	QueueArray(){
		a = new Object[capacity];
		size = 0;
	}
	
	public void add(Object ob){
		if(size == 0){
			a[size++] = ob;
		}
		else if(size == capacity){
			resize();
			a[size++] = ob;
		}
		else{
			a[size++] = ob;
		}
			
	}
	private void resize(){
		int Newlen = 2 *capacity;
		Object[] temp = new Object[Newlen];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
		
	}
	public String toString(){
		String ret = "";
		for(int i = 0; i < size; i++){
			ret += "[" + a[i].toString() + ",";
		}
		ret += "]";
		return ret;
	}
	

	public static void main(String[] args) {
		QueueArray qa = new QueueArray();
		qa.add("fasf");
		qa.add(9);
		qa.add("da");
		System.out.println(qa);
		

	}

}
