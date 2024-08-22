package test;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	static int[] callArray() {
		int[] arr = {1,3,5,7,9};
		return arr;
		
	}
	
	static int sum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	static HashMap<String, Object> callPerson(Human h){
		
		HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("name", h.getName());
			map.put("age", h.getAge());
			map.put("addr", h.getAddr());
			return map;
			
			
			
	}
	
	public static Human maxAge(ArrayList<Human> humanList) {
		int maxAge = 0;
		for(int i=0; i<humanList.size(); i++) {
			if(humanList.get(i).getAge() > humanList.get(maxAge).getAge()) {
				maxAge = i; 
				
			}
		}
		
		return humanList.get(maxAge);
	}
	
	
}
