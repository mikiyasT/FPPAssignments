package W2A1Q2;

public class MainFrame extends Computer{
	int id;
	String location;
	
	MainFrame(String manufacturer,String processor,int ramSize,int diskSize,double processorSpeed,int id,String location){
		super(manufacturer,processor,ramSize,diskSize,processorSpeed);
		this.id = id;
		this.location = location;
	}
	
}
