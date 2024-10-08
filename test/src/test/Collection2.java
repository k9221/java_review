package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 홍길동, 30, 서울
		// 김철수, 20, 인천
		// 박영희, 25, 제주도
		Human hong = new Human("홍길동", 30, "서울"); // 3개의 값을 가지는 휴먼이라는 객체를 생성한다. 
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		
		//위의 3개의 값을 한번에 보내줄려고 할떄에
		
		ArrayList<Human> HumanList = new ArrayList<Human>(); // <>안에 Human으로 만든 객체이기 떄문에 Object가 아닌 Human을 넣어준다 (반드시 다시 복습하기!!)
		HumanList.add(hong); // () 여기 안에는 휴먼으로 만든 객체만 넣는게 가능하다. ex) "홍길동" -> X
		HumanList.add(kim);
		HumanList.add(park);
		
		ArrayList<Human> list = Test.callHuman();
	
		int[] arr = Test.callArray();
		
		
		HashMap<String, Object> map = Test.callPerson(hong);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));	
		System.out.println(map.get("addr"));
		
		int num = Test.sum(30, 20);
		System.out.println(num);
		
		
		
	}

}
