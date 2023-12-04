package java_ch13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		
		//Set은 중복 제거 할때 씀!!!
		
		set.add("홍길동");
		set.add("이순신");
		set.add("강감찬");
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String result = iterator.next(); // 1개씩 객체를 반환함
			System.out.println(result);
		}
	}

}
