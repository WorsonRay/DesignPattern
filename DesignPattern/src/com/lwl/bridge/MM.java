package com.lwl.bridge;

public class MM {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void order(Boy b) {
		b.doSomeThing();
	}
}
