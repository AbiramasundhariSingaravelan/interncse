package com.example.demo;

public class Employee {

	private int id;
	private String name;
	private String design;
	private int salary;
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
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void display()
	{
		System.out.println("ID:"+id+"\nNAME:"+name+"\nDesignation: "+design+"\nSalary:"+salary);
	}
}
