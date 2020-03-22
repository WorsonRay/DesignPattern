package com.lwl.strategy;
/**
 * 比较
 * @author Administrator
 *
 */
public class Cart implements Comparable<Cart> {

	private Integer id;

	private String username;
	private Integer age;

	private Integer weight;

	@Override
	public int compareTo(Cart o) {

		return 0;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}
