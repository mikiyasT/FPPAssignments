package W2A1Q6;

public class MainFrame extends Computer{
	
	int id;
	String location;
	
	MainFrame(String manufacturer, String processor, int ramSize, int diskSize,double processorSpeed,int id,String location) {
		super(manufacturer, processor, ramSize, diskSize, processorSpeed);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean equals(Object o) {
		if( o == null) return false;
		if(!(o instanceof MainFrame)) return false;
		MainFrame m = (MainFrame)o;
		if(this.id == m.id && this.location == m.location)
			return true;
		else
			return false;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		MainFrame mf = (MainFrame)super.clone();
		return mf;
	}

	@Override
	public int hashCode() {
		int code = 13;
		code = (int)location.charAt(0) * code;
		code = code * id + code;
		return code;
	}
	
}
