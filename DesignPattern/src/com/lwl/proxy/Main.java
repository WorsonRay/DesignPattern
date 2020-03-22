package com.lwl.proxy;

import java.io.Serializable;

public class Main {
	public static void main(String[] args) throws Exception {

		/*Tank t = new Tank();

		TankLogProxy tlp = new TankLogProxy(t);
		TankTimeProxy ttp = new TankTimeProxy(tlp);
		ttp.move();*/
		
		Proxy.newProxyInstance(Serializable.class);
		
		
	}
}
