package calc;

interface Test
{
	public void demo(int result);
}
class Demo implements Test{
	
	public void demo() {
		System.out.println("Demo Method");
	}
}
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test() {
			public void demo() {
				System.out.println("Anonymous Class")
			}
		};
		t.demo();
		Test t1=(result)->{
			System.out.println("Lambda Expression");
			t1.demo(100);//calling
		});
	}

}
