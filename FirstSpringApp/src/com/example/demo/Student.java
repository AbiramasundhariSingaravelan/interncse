package com.example.demo;

public class Student {

	private int id;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void display()
	{
		System.out.println("ID:"+id+"\nNAME:"+name);
	}

	
}
