package com.lwl.proxy;
/**
 * 模拟编译
 * @author Administrator
 *
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

public class TestCompiler {

	public static void main(String[] args) throws Exception {
		String src ="package com.lwl.proxy;\r\n" + 
				"/**\r\n" + 
				" * 聚合的方式 实现查询 时间，那就可以继续使用\r\n" + 
				" * @author Administrator\r\n" + 
				" *\r\n" + 
				" */\r\n" + 
				"public class TankTimeProxy implements Movable {\r\n" + 
				"	Movable t;\r\n" + 
				"	public TankTimeProxy(Movable t) {\r\n" + 
				"		super();\r\n" + 
				"		this.t = t;\r\n" + 
				"	}\r\n" + 
				"	public void move() {\r\n" + 
				"		long start = System.currentTimeMillis();\r\n" + 
				"		t.move();\r\n" + 
				"		long end = System.currentTimeMillis();\r\n" + 
				"		System.out.println(\"用的时间：\"+(end-start));\r\n" + 
				"		\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"}";
		
		String fileName = System.getProperty("user.dir") + "/src/com/lwl/proxy/TankTimeProxy.java";

		File f = new File(fileName);
		FileWriter fw = new FileWriter(f);
		fw.write(src);
		fw.close();
		
		// Compile
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable unites = fileMgr.getJavaFileObjects(fileName);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, unites);
		t.call();
		fileMgr.close();
		
		// load into memery and create instances
		//硬盘中的class文件，load到内存中
		URL[] urls = new URL[]{new URL("file:/"+System.getProperty("user.dir")+"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.lwl.proxy.TankTimeProxy");
		System.out.println(c);
		
		Constructor ctr = c.getConstructor(Movable.class);
	
		Movable m = (Movable)ctr.newInstance(new Tank());
		m.move();
		
	}
}
