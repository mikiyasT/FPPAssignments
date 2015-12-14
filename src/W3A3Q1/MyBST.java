package W3A3Q1;


import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
// Demo code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	int size;

	public MyBST() {
		root = null;
		size = 0;
	}
	
	/**
	* Prints the values in the nodes of the tree
	* in sorted order. Inorder Traversal
	*/
	// Inorder Traversal to print the nodes in Ascending order
	private void printTreeInorder( BinaryNode t ){
		if( t != null ){
			System.out.print(t.element+",");
			printTreeInorder( t.left );		   
		    printTreeInorder( t.right );
		} 
	}
	
	// Preorder Traversal to print the nodes in Ascending order
		private void printTreePreorder( BinaryNode t ){
			if( t != null ){
				printTreePreorder( t.left );
			    System.out.print(t.element+",");
			    printTreePreorder( t.right );
			} 
		}
		 
		
		// Postorder Traversal to print the nodes in Ascending order
		private void printTreePostorder( BinaryNode t ){
			if( t != null ){
				printTreePostorder( t.left );
				printTreePostorder( t.right );	
				System.out.print(t.element+",");
			   
			} 
		}
		
		public boolean contains(int key){
			BinaryNode n = root;
		
			if(n == null)
				return false;
			else{
				
					while(n != null)
					{
						if( n.element == key)
							return true;
						else if(key > n.element)
							n = n.right;
						else
							n = n.left;
						
					}
					return false;
			}
			
		}
		public BinaryNode getRoot(){
			return root;
		}
		
		public int leafNodes(BinaryNode t){
			
			if(t == null)
				return 0;		
			else if(t.left == null && t.right == null)
				return 1;
			else 
			return leafNodes(t.left) + leafNodes(t.right);	
			
			
		}
		
		
				 
	//Assume the data in the Node is an Integer.	
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		}
		else { 
			BinaryNode n = root;
			boolean inserted = false;

			while(!inserted)//true
				{
				if(x.compareTo(n.element)<0) {
					//space found on the left
					if(n.left == null){
						n.left = new BinaryNode(x,null,null);
						inserted = true;
					}
					//keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				}				
				else if(x.compareTo(n.element)>0){ 
					//space found on the right					
					if(n.right==null){
					n.right = new BinaryNode(x,null,null);
					inserted = true;
					}
						//keep looking for a place to insert (a null)
					else {
							n = n.right;
					}
										
				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
		size++;
	}
	public int size(){
		return size;
	}
	public boolean isLeaf(BinaryNode t){
		if( t== null)
			return false;
		else if( t.left == null && t.right == null)
			return true;
		else
			return false;
		
	} 
	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left;      // Left child
		private BinaryNode right;     // Right child	  
		// Constructors 
		
		BinaryNode( Integer theElement ){
			this( theElement, null, null );
		}	

		BinaryNode( Integer element, BinaryNode left, BinaryNode right ){
			this.element = element;
			this.left = left;
			this.right = right;
		}
		
	}
		

	public static void main(String[] args) {
		
		MyBST mybst = new MyBST();
		
		int [] a = {15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25};
		System.out.println("Inserting array of numbers " + a);
		for (int j = 0; j < a.length; j++ ) {
			mybst.insert(a[j]);
					
		}
		mybst.insert(12);
		System.out.println(" \n Post Order traversal");
		mybst.printTreePostorder(mybst.root);
		System.out.println("\n Pre Order traversal");
		mybst.printTreePreorder(mybst.root);
		System.out.println("\n InOrder traversal");
		mybst.printTreeInorder(mybst.root);
		
		System.out.println("Searching for 19 " + mybst.contains(19));
		System.out.println("Searching for 55 " + mybst.contains(55));
		System.out.println("Size of tree " + mybst.size());
		System.out.println("Number of leaf nodes " + mybst.leafNodes(mybst.root));
		
			
	}
}