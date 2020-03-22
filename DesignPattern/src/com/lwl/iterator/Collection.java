package com.lwl.iterator;

import com.lwl.iterator.Iterator;

public interface Collection {

	void add(Object o);
	int size();
	Iterator iterator();
}
