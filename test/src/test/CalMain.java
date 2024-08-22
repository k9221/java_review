package test;

import java.util.ArrayList;
import java.util.HashMap;

public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> numMap = new HashMap<String, Integer>();
		numMap.put("num1", 100);
		numMap.put("num2", 20);
		
		//자바 스크립트에서는 numMap.name = 100; 와 같이 넣는다. 작성법이 다르다는 법도 알아두자!
		
		Calculator calc = new Calculator();
		int result = calc.div(numMap);
		System.out.println(result);
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(100.5);
		list.add(11.3);
		
		// 인터페이스에 minus 추상메소드 작성 후 오버라이딩해서 구현하기
		double result2 = calc.minus(list);
		System.out.println(result2);
		
		
		
	}
		
		
}
