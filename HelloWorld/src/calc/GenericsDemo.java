package calc;

class Additionn<T,U>
{
	T a;
	U b;
	Additionn(T a,U b)
	{
		this.a=a;
		this.b=b;
	}
	public T getA()
	{
		return this.a;
	}
	public U getB()
	{
		return this.b;
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Additionn<Integer,Float> value=new Additionn<Integer,Float>(100,10.5f);
		Additionn<Float,String> b=new Additionn<Float,String>(10.5f,"Arthi");
		System.out.println("Integer Value & Float Value: "+value.getA()+","+b.getB());
		System.out.println("Float Value & String Value: "+b.getA()+","+b.getB());
	
	}

}
