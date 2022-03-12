package com.comapany.phase2;

public class User {
	
	protected int id;
	protected String name;
	protected String no;
	protected String processor;
	
	public User() {
	}
	
	public User(String name, String no, String processor) {
		super();
		this.name = name;
		this.no = no;
		this.processor =processor ;
	}

	public User(int id, String name, String email, String processor) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.processor = processor;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String No) {
		this.no = no;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
}

