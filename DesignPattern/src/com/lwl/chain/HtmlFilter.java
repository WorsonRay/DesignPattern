package com.lwl.chain;

public class HtmlFilter implements Filter{

	@Override
	public String doFilter(String msg) {
		
		return msg.replace("<","[")
				.replace(">","]");
	}

}
