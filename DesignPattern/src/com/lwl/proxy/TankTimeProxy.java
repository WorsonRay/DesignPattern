package com.lwl.proxy;
/**
 * 聚合的方式 实现查询 时间，那就可以继续使用
 * @author Administrator
 *
 */
public class TankTimeProxy implements java.io.Serializable {
	Movable t;
	public TankTimeProxy(Movable t) {
		super();
		this.t = t;
	}
	public void move() {
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("用的时间："+(end-start));
		
	}

}