package com.lwl.chain;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg.replace("被就业", "就业").replace("敏感", "");
	}

	
}
