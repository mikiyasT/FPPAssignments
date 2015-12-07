package W2A1Q6;

public class Computer implements Cloneable {
	
	String manufacturer;
	String processor;
	
	int ramSize;
	int diskSize;
	double processorSpeed;
	
	Computer(String manufacturer,String processor,int ramSize,int diskSize,double processorSpeed){
		this.manufacturer = manufacturer;
		this.processor = processor;
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
	
		
	public boolean equals(Object o){
		if( o == null) return false;
		if(!(o instanceof Computer)) return false;
		Computer n = (Computer)o;
		int ramSize;
		int diskSize;
		double processorSpeed;
		
		if(this.ramSize == n.ramSize && this.diskSize == this.diskSize && this.processorSpeed == n.processorSpeed
				&& 
				this.manufacturer == n.manufacturer  && this.processor.equals(n.processor))
			return true;
		else
			return false;
	}
	
	public int hashCode() {
		int code = 23;
		code = (int)processor.charAt(0) * code;
		code = code * ramSize + code;
		code = code * diskSize + code;
		code = (int)manufacturer.charAt(0) * code;
		return code;
	}
	
	public String toString(){
		return "Computer of manufacturer " + manufacturer + " Processor " + processor;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Computer comp = (Computer)super.clone();
		return comp;
	}
	
}
