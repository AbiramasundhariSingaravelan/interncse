package calc;

import java.util.Scanner;

class AgeisNegativeException extends Exception
{
	AgeisNegativeException(String message)
	{
		super(message);
	}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}
public class CustomException {

	public void validate()throws Exception
	{
		int age;
		System.out.println("Enter your age");
		Scanner s=new Scanner(System.in);
		try {
		  age=s.nextInt();
		  if(age<0)
			  throw new AgeisNegativeException("Age cannot be negative");
		  else if(age<18)
			 throw new InvalidAgeException("Age must > 18");
		  else
			  System.out.println("Eligible to Vote");
		}
		catch(AgeisNegativeException e)
		{
			System.out.println("Invalid Age");
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		CustomException e=new CustomException();
		e.validate();
	}

}
