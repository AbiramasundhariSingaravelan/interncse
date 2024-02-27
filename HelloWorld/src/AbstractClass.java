abstract class Employee{
	public void print()
	{
		System.out.println("Employee");
	}
	public abstract void printt();
}
class Manager extends Employee
{
	public void printt()
	{
		System.out.println("Manager");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager e=new Manager();
		e.print();
		e.printt();
	}

}
