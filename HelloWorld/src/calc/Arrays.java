package calc;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int [5];
		//a=100,200,300,400,500
		System.out.println("Enter array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Entered array Elements");
		for(int i=0;i<5;i++)
		{
			//A[0]=1
			//A[1]=
			System.out.println("A["+i+"]= "+a[i]);
		}
	}

}
