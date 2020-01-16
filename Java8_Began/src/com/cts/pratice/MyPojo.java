package com.cts.pratice;

public class MyPojo {
	private int no;
	private String name;
	private int no1;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo1() {
		return no1;
	}
	public void setNo1(int no1) {
		this.no1 = no1;
	}
	public MyPojo() {
		super();
	}
	public MyPojo(int no, String name, int no1) {
		super();
		this.no = no;
		this.name = name;
		this.no1 = no1;
	}


	@Override
	public String toString() {
		return "MyPojo [no=" + no + ", name=" + name + ", no1=" + no1 + "]";
	}
	

}
