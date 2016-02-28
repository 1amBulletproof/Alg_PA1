/** Original code was provided by "Introduction to Java Programming" 
 * 8th Edition by Y. Daniel Liang, pages 858 - 869
 *
 *  This code is used for educational purposes only
 *  in 605.421 Foundations of Algorithms. 

 *  Modified (version 2) and used by 
 *  @author Brandon Tarney 2/15/16

 * @version 2: made this a main class to execut the 4 methods I added to BinaryTree.java
 */
package com.tarney.main;

import com.tarney.tree.BinaryTree;

public class BinaryTreeMain {
	
  public static void main(String[] args) {

	  /*input array items will be added in the order listed in the array below*/
	  String[] input = new String[]{"5", "7", "3", "2", "4", "6", "8"};

	  BinaryTree<String> tree = new BinaryTree<>(input);
	  
	  int height = tree.getHeight();
	  System.out.println("Height of Tree is: " + height );
	  
	  System.out.println("Post Order Traversal: ");
	  tree.postOrderTraversal();
	  
	  int numberOfLeaves = tree.getNumberOfLeaves();
	  System.out.println("\nNumber of Leaves: " + numberOfLeaves);
	  
	  int numberOfNonLeaves = tree.getNumberOfNonLeaves();
	  System.out.println("Number of non-leaves: " + numberOfNonLeaves);
  }
  
}