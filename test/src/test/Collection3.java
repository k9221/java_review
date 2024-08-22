package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "홍길동");
		map1.put("age", 31);
		map1.put("addr", "서울");

		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "김철수");
		map2.put("age", 30);
		map2.put("addr", "부산");

		HashMap<String, Object> map3 = new HashMap<String, Object>();
		map3.put("name", "박영희");
		map3.put("age", 24);
		map3.put("addr", "경기");

		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();

		list.add(map1);
		list.add(map2);
		list.add(map3);
		System.out.println(list);

		int num = 0;

		for (int i = 0; i < list.size(); i++) {
			if ((int) list.get(i).get("age") > 25) {
				num += 1;
			}
		}
		System.out.println("25살 이상 사람의 수는" + num + "입니다!");

		int age = 0;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).get("name").equals("김철수")) {
				age = (int) list.get(i).get("age");
			}

		}
		System.out.println("김철수의 나이는" + age + "입니다.");
	}
	
	
}
