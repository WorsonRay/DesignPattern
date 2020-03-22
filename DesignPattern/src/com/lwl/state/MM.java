package com.lwl.state;

import com.lwl.state.MMState;
/**
 * 
 * @author Administrator
 *
 */
public class MM {

	private String name;

	private MMState state;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void cry() {
		state.cry();
	}
	
	public void smile() {
		state.smile();
	}
	public void say() {
		state.smile();
	}
}
