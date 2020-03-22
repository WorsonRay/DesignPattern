package com.lwl.iterator;

import com.lwl.iterator.Collection;

public class Test {

	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();
//		Collection al = new ArrayList();
		Collection al = new LinkedList();
		for(int i=0;i<15;i++) {
			al.add(new Cat());
		}
		System.out.println(al.size());
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
