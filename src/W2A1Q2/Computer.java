package W2A1Q2;

public class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	Computer(String manufacturer,String processor,int ramSize,int diskSize,	double processorSpeed){
		this.manufacturer = manufacturer;
		this.processor =  processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
		
	}
	
	int getRamSize(){
		return ramSize;
	}
	int getDiskSize(){
		return diskSize;
	}
	double getProcessorSpeed(){
		return processorSpeed;
	}
	
	double computePower(){
		return ramSize * processorSpeed;
	}
	

}
