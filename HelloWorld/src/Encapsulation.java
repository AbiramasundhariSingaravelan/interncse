
class Student
{
	private int rollno,age;
	private String name, dept;
	public int getRollno()
	{
		return rollno;//100
	}
	public void setRollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student();
		s.setRollno(100);
		s.setName("Arthi");
		s.setAge(20);
		s.setDept("CSE");
		System.out.println("RollNO: "+s.getRollno());
		System.out.println("Age: "+s.getAge());
		System.out.println("Name: "+s.getName());
		System.out.println("Dept: "+s.getDept());

	}

}
