package W2A1Q2;

public class Notebook extends Computer{
	double height;
	double width;
	double weight;
	
	Notebook(String manufacturer,String processor,int ramSize,int diskSize,	double processorSpeed,double height, double width,double weight){
		super(manufacturer,processor,ramSize,diskSize,processorSpeed);
		this.height = height;
		this.width = width;
		this.weight = weight;
	}
	double screenSize(){
		return height * width;
	}
	
}
