package com.lwl.iterator;

import com.lwl.iterator.Collection;

public class ArrayList implements Collection {

	private int size;

	private Object[] elementData;

	private static final Object[] EMPTY_ELEMENTDATA = {};
	
	private static final int DEFAULT_CAPACITY = 10;

	public ArrayList(int initialCapacity) {
		if(initialCapacity > 0) {
			elementData = new Object[initialCapacity];
		}else if(initialCapacity == 0) {
			elementData = EMPTY_ELEMENTDATA;
		}
	}
	public ArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	public void add(Object o){
		if(elementData.length == size) {
			Object[] dest = new Object[size * 2];
			System.arraycopy(elementData, 0, dest, 0, elementData.length);
			elementData = dest;
		}
		elementData[size] = o;
		size ++;
	}
		
	public int size() {
		return size;
	}
	@Override
	public Iterator iterator() {
		return new ArrayListIterator();
	}
	
	private class ArrayListIterator implements Iterator{

		private int cursor = 0;
		@Override
		public boolean hasNext() {
			if(cursor >= size) {
				return false;
			}else
			return true;
		}

		@Override
		public Object next() {
			Object o = elementData[cursor];
			cursor ++;
			return o;
		}
		
	}
	
}
