package com.lwl.chain;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestMin {

	public static void main(String[] args) {

		String str = "大家好:) 被就业，敏感，阿里斯顿副科级啊岁的<，>";

		MessageProcessor mp = new MessageProcessor();
		mp.setMsg(str);

		FilterChain fc = new FilterChain();

		fc.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
		mp.setFc(fc);
		System.out.print(mp.proccess());

	}
}
