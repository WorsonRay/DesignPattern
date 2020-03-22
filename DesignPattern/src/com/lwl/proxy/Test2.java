package com.lwl.proxy;

import java.lang.reflect.Method;

public class Test2 {

	public static void main(String[] args) {
		
		Method[] methods = Movable.class.getMethods();
		
		for(Method m:methods) {
			System.out.println(m);
		}
	}
}
