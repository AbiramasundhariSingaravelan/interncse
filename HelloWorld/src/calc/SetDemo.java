package calc;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> union=new HashSet<Integer>(s);
		Set<Integer> inter=new HashSet<Integer>(s);
		Set<Integer> diff=new HashSet<Integer>(s);
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		s1.add(100);
		s1.add(200);
		s1.add(5000);
		s1.add(50);
		s1.add(4000);
		System.out.println("SET1 :" +s);
		System.out.println("SET2 :"+s1);
		union.addAll(s1);
		inter.retainAll(s1);
		diff.removeAll(s1);
		System.out.println("UNION: "+union);
		System.out.println("INTERSECTION: "+inter);
		System.out.println("DIFFERENCE: "+diff);
	}

}
