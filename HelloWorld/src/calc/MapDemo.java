package calc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> data=new HashMap<String,Integer>();
		data.put("Arthi",100);
		data.put("Abinaya", 101);
		Set mapset=data.entrySet();
		Iterator itr=mapset.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue())
			;
		}
	}

}
