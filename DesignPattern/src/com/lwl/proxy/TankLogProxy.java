package com.lwl.proxy;
/**
 * 聚合的方式 实现查询 时间，那就可以继续使用
 * @author Administrator
 *
 */
public class TankLogProxy implements Movable {
	Movable t;
	public TankLogProxy(Movable t) {
		super();
		this.t = t;
	}
	@Override
	public void move() {
		System.out.println("记录tank日志开始...");
		t.move();
		System.out.println("记录tank日志结束...");
		
	}

}
