package W2A1Q6;

public class MainFrame extends Computer{
	int id;
	String location;
	@Override
	double costProduct() {
		// TODO Auto-generated method stub
		return 20000;
	}
	@Override
	public boolean equals(Object o) {
		if( o == null) return false;
		if(!(o instanceof MainFrame)) return false;
		MainFrame m = (MainFrame)o;
		if(this.id == m.id && this.location == m.location)
			return true;
		else
			return false;
	}
	
}
