package java_ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member1 = new Member("홍길동", 27, "010-8888-1234", "경기도 성남시");
		Member member2 = new Member("이순신", 31, "010-9999-1234", "서울 용산구");
		Member member3 = new Member("김유신", 45, "010-7777-1234", "경기도 안양시");
		
		//리스트의 이름 memberlist
		
		ArrayList<Member> memberlist = new ArrayList<Member>();
		
		memberlist.add(member1); // 인덱스 0
		memberlist.add(member2); // 인덱스 1
		memberlist.add(member3); // 인덱스 2
		
		
		
		
		
	}

}
