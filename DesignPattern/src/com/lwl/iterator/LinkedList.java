package com.lwl.iterator;

import com.lwl.iterator.Collection;

public class LinkedList implements Collection {

	Node head = null;
	Node tail = null;
	int size = 0;
	public void add(Object o) {
		Node n = new Node(o,null);
		System.out.println(o);
		if(head == null) {
			head = n;
			tail = n;
		}
		tail.setNext(n);
		tail = n;
		size++;
	}
	public int size(){
		return size; 
	}
	@Override
	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{
		private Node cursor = LinkedList.this.head;
		@Override
		public boolean hasNext() {
			if(cursor == null ) {
				return false;
			}else {
				return true;
			}
		}
		@Override
		public Object next() {
			Object o = cursor.getData(); 
			cursor = (Node)cursor.getNext();
			return o;
		}
	}
}
