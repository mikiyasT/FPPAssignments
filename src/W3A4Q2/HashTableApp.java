package W3A4Q2;




//demonstrates hash table user defined implementation with linear probing

import java.io.*;
import java.util.Scanner;
////////////////////////////////////////////////////////////////
class DataItem
{                                // (could have more data)
	private String mail_id;               // data item (key)
	private String name;
	//--------------------------------------------------------------
	public DataItem(String mail, String v)          // constructor
	{ 
		mail_id = mail;
	    name = v;
	}
	//--------------------------------------------------------------
	public String getKey()
	{
		return mail_id;
	}
	public String getValue()
	{ 
		return name; 
	}
	//--------------------------------------------------------------
}  // end class DataItem
	////////////////////////////////////////////////////////////////
class HashTable
{
	private DataItem[] hashArray;    // array holds hash table
	private int arraySize;
	private DataItem nonItem;        // for deleted items
	//-------------------------------------------------------------
	public HashTable(int size)       // constructor
	{
		 arraySize = size;
		 hashArray = new DataItem[arraySize];
		 nonItem = null;   // deleted item key is -1
	}
	//-------------------------------------------------------------
	public void displayTable()
	 {
		 System.out.println("Table: ");
		 for(int j=0; j<arraySize; j++)
		 {
		    if(hashArray[j] != null)
		       System.out.println("Index : " + j + " " + hashArray[j].getKey() + " " + hashArray[j].getValue());
		    else
		       System.out.println("Index : " + j + " " + "**");
		 }
		 System.out.println("");
	 }
	//-------------------------------------------------------------
	public int hashFunc(String key)
	 {
		return key.hashCode() % arraySize;       // hash function
	 }
	//-------------------------------------------------------------
	public void insert(String id, String v) // insert a DataItem
	//(assumes table not full)
	 {
	      // extract key
		 int hashVal = hashFunc(id);  // hash the key
		 if(hashVal < 0) 
			 hashVal *= -1;
		                               // until empty cell 
		//an index have some data and not match with existing key, it find next vacant position 
		 while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != id) 
	     {
		    ++hashVal;                 // go to next cell
		    hashVal %= arraySize;      // wraparound if necessary
	     }
		 DataItem obj = new DataItem(id,v);
		 hashArray[hashVal] = obj;    // insert item
	 }  // end insert()
	//-------------------------------------------------------------
	public DataItem delete(String key)  // delete a DataItem
	{
		 int hashVal = hashFunc(key);  // hash the key
		
		 while(hashArray[hashVal] != null)  // until empty cell,
		 {                               // found the key?
		    if(hashArray[hashVal].getKey() == key)
	        {
			       DataItem temp = hashArray[hashVal]; // save item
			       hashArray[hashVal] = nonItem;       // delete item
			       return temp;                        // return item
		     }
		    ++hashVal;                 // go to next cell
		    hashVal %= arraySize;      // wraparound if necessary
		  }
		 return null;                  // can't find item
	 }  // end delete()
	//-------------------------------------------------------------
	public boolean find(String key)    // find item with key
	 {
		 int hashVal = hashFunc(key);  // hash the key
		
		 while(hashArray[hashVal] != null)  // until empty cell,
		  {                               // found the key?
		    if(hashArray[hashVal].getKey() == key)
		       return true;   // yes, return item
		    ++hashVal;                 // go to next cell
		    hashVal %= arraySize;      // wraparound if necessary
		 }
		 return false;                  // can't find item
	 }
	//-------------------------------------------------------------
}  // end class HashTable
////////////////////////////////////////////////////////////////
public class HashTableApp
{
	public static void main(String[] args) throws IOException
	{
		 String aKey;
		 String value;
		                             
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter size of hash table: ");
		 int size = in.nextInt();
		                           
		 HashTable theHashTable = new HashTable(size);
		
		 theHashTable.insert("write2miki","Mikiyas");
		 theHashTable.insert("Eyob.niguse","Eyob");
		 theHashTable.insert("dav.be","Dawit");
		 theHashTable.insert("mykey","Liab");

		   while(true)                   // interact with user
		    {
			    System.out.print("Enter first letter of ");
			    System.out.print("[S]how, [I]nsert, [D]elete, or [F]ind: ");
			    char choice = in.next().charAt(0); //Read a Char from the console
			    switch(choice)
			       {
				       case 's':
				          theHashTable.displayTable();
				          break;
				       case 'i':
				       System.out.print("Enter email id  and namee to insert: ");
				          aKey = in.next();
				          value = in.next();
				          theHashTable.insert(aKey,value);
				          break;
				       case 'd':
				          System.out.print("Enter key value to delete: ");
				          aKey = in.next();
				          theHashTable.delete(aKey);
				          break;
				       case 'f':
				          System.out.print("Enter key value to find: ");
				          aKey = in.next();
				          System.out.println("Key Found status" + theHashTable.find(aKey));
				          break;
				       default:
				          System.out.print("Invalid entry\n");
			       }  // end switch
		    }  // end while
	}  // end main()
//--------------------------------------------------------------
}  // end class HashTableApp
////////////////////////////////////////////////////////////////

