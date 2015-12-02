package W2A1Q6;

public class Notebook extends Computer{
	double height;
	double width;
	double weight;
	
	double screenSize(){
		return height * width;
	}

	@Override
	double costProduct() {
		// TODO Auto-generated method stub
		return 750;
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
}
