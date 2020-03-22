package com.lwl.iterator;

public class Node {
	private Object next;
	private Object data;
	private Node() {
		
	}
	public Node(Object o,Object next) {
		data = o;
		this.next = next;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
