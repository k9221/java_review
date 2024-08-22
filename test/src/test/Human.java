package test;

public class Human {
	// 내가 사람의 클래스를 만들고, name, age, address 이름,나이,주소를 담을 변수를 설정해준다. 
	private String name; //보안상의 이유로 변수 앞에는 private을 붙여서 보안성을 강화한다.
	private int age;
	private String addr;
	
	public Human(String name, int age, String addr) { //생성자에 대한 개념을 복습하기 why? 초기화 하기 위해서 private으로 설정하면 접근 불가 public으로 선언
		this.name = name;                             // 또한 public뒤에 String,int와 같이 데이터 타입을 선언할 필요가 없다.
		this.age = age;
		this.addr = addr;
	}      //우클릭 > soure > Generate Getter and setter 선택하면 자동으로 생성된다.
	
	
	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getAddr() {
		return addr;
	}



	public void setName(String name) {

		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

}
