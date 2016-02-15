package com.tarney.tree;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryTreeTest {
	
	static BinaryTree<String> tree;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
		System.out.println(tree.size);
		tree.clear();
		
		//test integers
		BinaryTree<Integer> tree2 = new BinaryTree<>();
		tree2.insert(1);
		tree2.insert(0);
		tree2.insert(3);
		assertThat("Tree height = 2", tree2.getHeight(), is(2));
		tree2.clear();
	}
}
