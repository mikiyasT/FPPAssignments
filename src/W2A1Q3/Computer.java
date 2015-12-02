package W2A1Q3;

public abstract class Computer {
	
	String manufacturer;
	String processor;
	int ramSize;
	int diskSize;
	double processorSpeed;
	
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
	abstract double costProduct();

}
