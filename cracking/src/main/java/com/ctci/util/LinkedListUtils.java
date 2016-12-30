package com.ctci.util;

import com.ctci.chapter2.Node;

public class LinkedListUtils {
	
	public static Node createListOfNodes() {
		Node node1 = new Node(5, null);
		Node node2 = new Node(6, node1);
		Node node3 = new Node(8, node2);
		Node node4 = new Node(5, node3);
		Node node5 = new Node(7, node4);
		return node5;
	}
	
	public static String printNodes(Node node) {
		StringBuilder output = new StringBuilder();
		
		while(node != null) {
			output.append(node.getData());
			
			if(node.hasNext() == true) {
				output.append(", ");
			}
			node = node.getNode();
		}
		
		return output.toString();
		
	}

}
