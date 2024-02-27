
class Vehicle
{
	public  Vehicle()
	{
		System.out.println("Default Constructor");
	}
	public Vehicle(int wheels)
	{
		System.out.println(wheels);
	}
	public void print(int mileage)
	{
		System.out.println(mileage);
	}
	public void print(String brand)
	{
		System.out.println(brand);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		Vehicle v1=new Vehicle(4);
		v.print("MILEAGE: "+18);
		v.print("BRAND: "+"Honda");
	}

}
