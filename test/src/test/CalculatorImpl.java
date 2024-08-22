package test;

import java.util.ArrayList;
import java.util.HashMap;

public interface CalculatorImpl { // interface에서 메소드를 정의하면 추상메소드로 변경된다.
	// 숫자 2개를 받아서 더해서 리턴해주는 추상메소드 작성
	public int sum(int x, int y); // 추상 메소드이기 때문에 내용을 구체화 시키지 않는다.
	// Calculator 클래스를 만들어서 해당 인터페이스 상속받아서 구현해라.
	
	public int mul(int x,int y);
	
	public int div(HashMap<String, Integer> numMap);
	
	public double minus(ArrayList<Double> list);
	
	public static  maxAge(ArrayList<Human> humanList)
}
