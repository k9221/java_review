package test;

import java.util.ArrayList;

public class Test {
	static ArrayList<Human> callHuman() { //배운 내용 무조건 복습하기!!!!!!!!!!!!
		Human hong = new Human("홍길동", 30, "서울"); 
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주도");
		
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		return list;  
	}
}
