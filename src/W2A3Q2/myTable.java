package W2A3Q2;

public class myTable {
	
	Entry[] entries = new Entry[26];
	static int cntr;
	
	void add(char c, String s){
		for(int i = 0; i < cntr; i++){
			if(entries[i].chr == c){
				entries[i].str = s;
				break;
			}
				
		}
		entries[cntr] =  new Entry(c,s);
		
	}
	
	String get(char c){
		String s = "";
		for(int i = 0; i < cntr; i++){
			if(entries[i].chr == c){
				s = entries[i].str;
				break;
				
			}
		}
		return s;
	}
	
	public String toString(){
		String out = "";
		for(int i = 0; i< cntr; i++)
			out += "" + entries[i].chr + " --> " + entries[i].str + "\n";
		return out;
	}
	
	class Entry{
		String str;
		char chr;
		
		Entry(char c, String s){
			str = s;
			chr = c;
			cntr++;
		}
		
		public String toString(){
			return null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myTable tb = new myTable();
		tb.add('a', "abebe");
		tb.add('b', "belete");
		tb.add('c', "chala");
		tb.add('b', "bekele");
		
		
		
		System.out.println(tb);
		System.out.println(tb.get('c'));

	}

}
