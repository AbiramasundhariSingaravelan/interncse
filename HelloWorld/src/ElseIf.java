
public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=150;
		if(marks>=90)
		{
			if(marks<=100)
			System.out.println("A grade");
			
		}
		else if(marks>=80)
		{
			System.out.println("B Grade");
		}
		else if(marks>=70)
		{
			System.out.println("C Grade");
		}
		else if(marks>=60)
		{
			System.out.println("D Grade");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
