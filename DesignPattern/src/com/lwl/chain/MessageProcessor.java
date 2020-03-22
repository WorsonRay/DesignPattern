package com.lwl.chain;

public class MessageProcessor {

	private String msg;
//	Filter[] filters = {new HtmlFilter(),new SensitiveFilter()};
	
	FilterChain fc;
	public void setFc(FilterChain fc) {
		this.fc = fc;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String proccess() {
		/*for(Filter f:filters) {
			msg = f.doFilter(msg);
		}
		return msg;*/
		return fc.doFilter(msg);
	}
	
}
