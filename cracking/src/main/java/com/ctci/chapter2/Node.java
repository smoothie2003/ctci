package com.ctci.chapter2;

public class Node {

	private int data = 0;
	private Node node;

	public Node(int data, Node node) {
		this.setData(data);
		this.setNode(node);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public boolean hasNext() {
		if (this.getNode() != null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder toString = new StringBuilder();
		toString.append(" Data :" + this.data);

		if (node != null) {
			toString.append(this.node.toString());
		}
		return toString.toString();
	}

}
