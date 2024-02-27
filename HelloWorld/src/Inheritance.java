
interface Instrument
{
	public void type();
	public void speed();
}
interface Tuning
{
	public void speed();
}
class Keyboard implements Instrument,Tuning
{
	public void type()
	{
		System.out.println("Key Instrument");
	}
	public void speed()
	{
		System.out.println("Method of Tuning Interface");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Keyboard k=new Keyboard();
		Tuning t=new Keyboard();
		Keyboard k=new Tuning();//instantiation
		t.speed();//Tuning intreface->speed 
		k.speed();//Instrument ->speed
		k.type();
	}

}
