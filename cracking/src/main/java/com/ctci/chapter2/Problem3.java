package com.ctci.chapter2;

import com.ctci.util.LinkedListUtils;

public class Problem3 {
	
	public static void main(String args[]) {
		Node node = LinkedListUtils.createListOfNodes();
		
		System.out.println(node);
		
		deleteNode(node.getNode().getNode());
		
		System.out.println(node);
	}

	private static void deleteNode(Node node) {
		if(node == null || node.getNode() == null) {
			System.err.println(" Either node is null or the next node is null");
		}
		
		Node next = node.getNode();
		
		node.setData(next.getData());
		node.setNode(next.getNode());
		
	}

}
