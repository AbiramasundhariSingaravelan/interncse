package calc;

import java.util.Scanner;

class Division
{
	int a,b;
	public void divide()
	{
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("Enter A value");
			a=s.nextInt();
			System.out.println("Enter B Value");
			b=s.nextInt();
			System.out.println("Division:"+(a/b));
		}
		catch(InputMisMatchException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}

		catch(Exception e)
		{
			System.out.println("Cannot Divide by zero"+e);
		}
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division d=new Division();
		d.divide();
	}

}
