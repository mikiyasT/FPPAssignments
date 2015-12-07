package W2A1Q6;

public class Notebook extends Computer {
	
	double height;
	double width;
	double weight;
	
	
	Notebook(String manufacturer, String processor, int ramSize, int diskSize,double processorSpeed,double height,double width,double weight) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
		
		// TODO Auto-generated constructor stub
	}

	double screenSize(){
		return height * width;
	}
	
	public boolean equals(Object o){
		if( o == null) return false;
		if(!(o instanceof Notebook)) return false;
		Notebook n = (Notebook)o;
		if(this.height == n.height && this.width == this.width && this.weight == n.weight)
			return true;
		else
			return false;
	}
	public String toString(){
		return "Notebook of height " + height + " width " + width + " Weight " + weight;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Notebook notebook = (Notebook)super.clone();
		return notebook;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code = 37;
		code = code + code * (int)width;
		code = code + code * (int)height;
		code = code + code * (int)weight;
		
		return code;
	}
}
