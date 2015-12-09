package W3A1Q1;

public class PersonTest {

	public static void main(String[] args) {
		PersonArrayOp pao = new PersonArrayOp(4);
	
		pao.insert("mikiyas","liab",3);
		pao.insert("Teshome","mikiyas",30);
		pao.insert("Dereje","Hiwot",27);
		pao.insert("habtamu","gelila",8);
		System.out.println("Size of array is " + pao.size());
		pao.insert("teshome","dagi",13);
		System.out.println("Size of array is " + pao.size());
		
		pao.displayAll();
		pao.delete("Teshome");
		System.out.println("Size of array is " + pao.size());
		pao.displayAll();

	}

}
