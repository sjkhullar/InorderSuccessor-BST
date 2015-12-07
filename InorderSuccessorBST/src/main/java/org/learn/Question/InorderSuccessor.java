
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class InorderSuccessor {
	private static Node min(Node root) {
		//we found the min node
		if(root.left == null) {
			return root;
		}
		return min(root.left);
	}
	
	public static Node successor(Node root, Node node) {
		//Example 3 or Example 4
		if(node.right != null)
			return min(node.right);
		
		//Example 1 or Example 2
		Node successor = null;
	    // Start from root and search for successor down the tree
	    while (root != null)
	    {
	    	if(node.data == root.data) {
	    		//by now we might found our successor
	    		break;
	    	} else if (node.data < root.data) {
	        	successor = root;
	            root = root.left;
	        } else if (node.data > root.data)
	            root = root.right;	       
	    }
	   return successor;
	}
}
