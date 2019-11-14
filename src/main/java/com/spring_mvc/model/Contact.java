package com.spring_mvc.model;

public class Contact {
	private String name;
	private String info;
	//setter getter tostring constructor
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Contact() {
		super();
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", info=" + info + "]";
	}
	
}
