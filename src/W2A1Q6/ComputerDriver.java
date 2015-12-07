package W2A1Q6;

public class ComputerDriver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Computer comp1 = new Computer("Intel","amd",256,500,2.4);
		Notebook nt1 = new Notebook("Toshiba","intel",512,1000,2.8,10,15,4.5);
		
		Computer comp2 = (Computer)comp1.clone();
		Notebook nt2 = (Notebook)nt1.clone();
		
		System.out.println("Computer and notebook objects created");
		System.out.println(comp1);
		System.out.println(comp2);
		
		System.out.println(nt1);
		System.out.println(nt2);
		
		System.out.println("-------------------------");
		
		System.out.println("comp1 == comp2 : " + comp1.equals(comp2));
		System.out.println("comp1 hash, comp2 hash : " + comp1.hashCode() + "," + comp2.hashCode());
		System.out.println("nt1 == nt2 : " + nt1.equals(nt2));
		System.out.println("nt1 hash, nt2 hash : " + nt1.hashCode() + "," + nt2.hashCode());
	}

}
