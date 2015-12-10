package W3A1Q4;

public class PhoneDirectoryApp {

	public static void main(String[] args) {
		DirectoryOpr phoneDir = new DirectoryOpr();
		
		System.out.println("Phone directory is empty :  " + phoneDir.isEmpty());
		phoneDir.insertFirst("Miki",8989);
		phoneDir.insertFirst("Eyob",1099);
		phoneDir.insertFirst("Bem",6778);
		phoneDir.insertFirst("kal",6778);
		phoneDir.insertFirst("Bet",6778);
		
		System.out.println("Displaying list after adding at first -- total -- "+ phoneDir.size());
		
		phoneDir.displayList();
		phoneDir.deleteFirst();
		phoneDir.deleteFirst();
		
		System.out.println("Displaying list after deleting from first -- total -- "+ phoneDir.size());
		phoneDir.displayList();
		
		phoneDir.insertLast("kidi", 8767);
		phoneDir.insertLast("Fria", 7767);
		
		System.out.println("Displaying list after adding at last -- total -- "+ phoneDir.size());
		phoneDir.displayList();
		System.out.println("Phone directory is empty :  " + phoneDir.isEmpty());

	}

}
