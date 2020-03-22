package com.lwl.proxy;
/**
 * 继承的方式实现 查询 时间
 * @author Administrator
 *
 */
public class Tank2 extends Tank {
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("用的时间："+(end-start));
		
	}

}
