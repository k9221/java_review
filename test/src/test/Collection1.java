package test;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바, 오라클, html, jsp
		// String str[] = new String [4]; -> 문자열을 담을때 (배열은 중간의 값을 없앨려면 하나씩 크기를 줄여야 함 즉 삽입과 삭제가 불편)
		// 위의 4개의 문자열을 담을 수 있는 리스트 만드는 방법
		ArrayList<String> strList = new ArrayList<String>(); // 삽입과 삭제가 더 용이하다 왜냐 주소값으로 서로 연결하고 있기 떄문에(면접에도 자주 나옴)
		strList.add("자바");    //삽입을 할때에 보통 add, set을 사용한다 알아두기!!.
		strList.add("오라클");
		strList.add("html");
		strList.add("jsp"); // 이런 식으로 문자열을 담는게 가능해진다. ex) 모양으로는 [자바, 오라클, html, jsp]의 모양으로 형성
		
		strList.get(0); //get은 리스트에 저장되어 있는 값을 가져올 떄 사용 [여기서 list이기에 우리는 순차적으로 접근해야 함. ex) html을 가져오고 싶다면 index로 접근해야 한다.]
		//[자바, 오라클, html, jsp]-문자형
		for(int i=0; i < strList.size(); i++) { // 모든 값의 데이터를 가져올려면 for문을 이용하여서 순차적으로 접근한다. length-배열떄 사용 or size()-{컬렉션시 사용}를 사용한다. (*복습하기*)
			System.out.println(strList.get(i));
		}
		
		// [10, 30 ,50 ,100]-숫자형 Integer 은 그냥 아무 타입에 사용가능 int 사용 x
		ArrayList<Integer> numList = new ArrayList<>(); // 빈 <>를 넣어준다.
		
		// [홍길동, 30, 서울, 1234, new HashMap<String, Integer> map] - 숫자,글자,객체가 같이 있는 경우
		// 데이터 타입 상관없이 다 넣고 싶으면 Object 사용 (중요한 개념이니 다시 복습할 것!)
		// 업캐스팅과 다운캐스팅에 대한 개념도 같이 공부하자!
	
		ArrayList<Object> object = new ArrayList<Object>();
		object.add("홍길동");
		object.add(30);
		
		//object는 부모 클래스이기 떄문에 타입을 다운캐스팅 하여서 int로 데이터 타입을 변경해야 한다. 
		int a = (int) object.get(1);
		
		
		
	}
}
