package com.example.demo;

public class A {

	B bobj;
	A()
	{
		System.out.println("A Class");
	}
	public B getBobj() {
		return bobj;
	}
	public void setBobj(B bobj) {
		this.bobj = bobj;
	}
	public void print()
	{
		System.out.println("A print method");
		bobj.print();
	}
}
