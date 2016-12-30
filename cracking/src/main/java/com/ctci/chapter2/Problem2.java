package com.ctci.chapter2;

import com.ctci.util.LinkedListUtils;

public class Problem2 {
	
	public static void main(String args[]) {
		Node node = LinkedListUtils.createListOfNodes();
		
		System.out.println(LinkedListUtils.printNodes(node));
		
		node = returnKthElement(node, 2);
		
		System.out.println(node);
	}

	/**
	 * @param node
	 * @param i
	 * @return
	 */
	/**
	 * @param node
	 * @param i
	 * @return
	 */
	private static Node returnKthElement(Node node, int i) {
		
		if(node == null) {
			System.err.println(" Empty Linked List ");
			return node;
		}
		
		Node pointer = node;
		Node runner = node;
		
		for(int k = 0; k < i-1; k++) {
			runner = runner.getNode();
			
			if(runner == null) {
				System.err.println(" Linked List is too small for the kth element");
				return node;
			}
		}
		
		
		while(runner != null) { 
			
			pointer = pointer.getNode();
			runner = runner.getNode();
			
			if(runner.getNode() == null) {
				break;
			}
		}
		
		return pointer;
	}

}
