package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculator implements CalculatorImpl { // implements 다중 구현이 가능하다.

	@Override // 재정의
	public int sum(int x, int y) {
		return x+y;
	}

	public int mul(int x, int y) {
		return x*y;
	}

	public int div(HashMap<String, Integer> numMap) {
		int a = numMap.get("num1")/numMap.get("num2");
		return a;
	}

	public double minus(ArrayList<Double> list) {
		double a = list.get(0)-list.get(1);
		return a;
	}

}
