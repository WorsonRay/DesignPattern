package com.lwl.bridge;

import java.util.ArrayList;
import java.util.List;

import com.lwl.command.Command;

/**
 * 
 * @author Administrator
 *
 */
public class Boy {

	private String name;
	
	private List<Command> commands = new ArrayList<Command>();
	private List<Command> exedCommands = new ArrayList<Command>();
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void pursue(MM mm) {
		Gift g = new WildGift(new Ring());
		give(g,mm);
	}
	public void give(Gift g,MM mm) {
		
	}
	
	public void doSomeThing() {
		for(Command c:commands) {
			c.execute();
			exedCommands.add(c);
		}
	}
}
