package com.ctci.chapter2;

import java.util.HashSet;

import com.ctci.util.LinkedListUtils;

public class Problem1 {
	
	public static void main(String args[]) {
		
		Node listOfDuplicateNodes = LinkedListUtils.createListOfNodes();
		
		System.out.println(LinkedListUtils.printNodes(listOfDuplicateNodes));
		
		Node listOfUniqueNodes = removeDuplicates(listOfDuplicateNodes);
		
		System.out.println(LinkedListUtils.printNodes(listOfUniqueNodes));

	}

	private static Node removeDuplicates(Node listOfDuplicateNodes) {
		
		if(listOfDuplicateNodes == null || listOfDuplicateNodes.getNode() == null) {
			return listOfDuplicateNodes;
		}
		
		HashSet<Integer> hashSet = new HashSet<>();

		Node pointerNode = listOfDuplicateNodes;
		
		hashSet.add(pointerNode.getData());
		
		Node runnerNode = pointerNode.getNode();
		
		while(pointerNode != null) {
			
			if (!hashSet.contains(runnerNode.getData())) {
				hashSet.add(runnerNode.getData());
			} else {
				pointerNode.setNode(runnerNode.getNode());
				if(pointerNode.getNode() != null) {
					runnerNode.setNode(pointerNode.getNode().getNode());
					
				}
			}
			
			pointerNode = pointerNode.getNode();
			if(pointerNode != null) {
				runnerNode = pointerNode.getNode();
			}
		}

		return listOfDuplicateNodes;
	}

}
