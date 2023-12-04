package java_ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		List<String> list1 = new ArrayList<String>(); //빈 리스트
		
		list1.add("KOR"); // 인덱스 0
		list1.add("Jap"); // 인덱스 1
		list1.add("USA"); // 인덱스 2
		
		System.out.println(list1.size());//list1에 저장된 객체의 수
		
		System.out.println(list1.get(1));
		
		list1.remove(1);
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}
