package java_ch13_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map1 = new HashMap<String, Integer>(); 
		
		map1.put("나이", 21);
		map1.put("월급", 200);
		map1.put("연봉", 2400);
		
		System.out.println(map1.get("월급"));
		
		Set<String> keySet = map1.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map1.get(key));
		}

	}

}
