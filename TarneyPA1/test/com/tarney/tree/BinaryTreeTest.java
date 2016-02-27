package com.tarney.tree;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {
	
	static BinaryTree<String> tree;

	@Before
	public void setUpBeforeClass() throws Exception {
		tree = new BinaryTree<>();
		
	}

	@Test
	public void treeExists() {
		assertThat("The tree exists", tree, is(notNullValue()));
	}

	@Test
	public void treeHeight() {
		assertThat("Tree height = 0 ", tree.getHeight(), is(0));
		tree.insert("item1");
		assertThat("Tree height = 1 ", tree.getHeight(), is(1));
		tree.insert("item2");
		tree.insert("item3");
		assertThat("Tree height = 3 ", tree.getHeight(), is(3));
		tree.insert("anItem1");
		assertThat("Tree height = 3 ", tree.getHeight(), is(3));
		tree.insert("anItem2");
		tree.insert("anItem3");
		tree.insert("anItem4");
		assertThat("Tree height = 5 ", tree.getHeight(), is(5));
		tree.clear();
		
		//test integers
		BinaryTree<Integer> tree2 = new BinaryTree<>();
		tree2.insert(1);
		tree2.insert(0);
		tree2.insert(3);
		assertThat("Tree height = 2", tree2.getHeight(), is(2));
		tree2.clear();
	}
	
	@Test
	public void findLeaves() {
		assertThat("There are 0 leaves", tree.getNumberOfLeaves(), is(0));
		tree.insert("item1");
		assertThat("There is 1 leaf", tree.getNumberOfLeaves(), is(1));
		tree.insert("item2");
		tree.insert("item");
		assertThat("There are 2 leaves", tree.getNumberOfLeaves(), is(2));
		tree.insert("item3");
		tree.insert("item3");
		tree.insert("item3");
		tree.insert("item3");
		assertThat("There are 2 leaves", tree.getNumberOfLeaves(), is(2));
		tree.insert("item12");
		tree.insert("item11");
		tree.insert("item13");
		assertThat("There are 2 leaves", tree.getNumberOfLeaves(), is(4));
	}
	
	@Test
	public void postOrderTraversal() {

		System.out.println("Expected -> ");
		tree.postOrderTraversal();
		System.out.println(" <- Result\n");
		
		tree.insert("5");
		System.out.println("Expected -> 5");
		tree.postOrderTraversal();
		System.out.println(" <- Result\n");
		
		tree.insert("3");
		tree.insert("7");
		System.out.println("Expected -> 3 7 5");
		tree.postOrderTraversal();
		System.out.println(" <- Result\n");
		
		tree.insert("2");
		tree.insert("4");
		tree.insert("6");
		tree.insert("8");
		System.out.println("Expected -> 2 4 3 6 8 7 5");
		tree.postOrderTraversal();
		System.out.println(" <- Result\n");
	}
}
