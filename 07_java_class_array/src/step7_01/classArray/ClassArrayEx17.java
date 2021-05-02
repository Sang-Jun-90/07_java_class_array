package step7_01.classArray;

// 접근 제어자 : public , private + getter/setter
class PrivateTest {
	
	private int a;
	public int b;
	int c;
	
	// private 변수를 외부로 꺼내주는 메서드 getter
	int getA() {
		return this.a;
	}
	
	// 외부에서 private 변수의 값을 수정하는 메서드 setter
	void setA(int a) {
		this.a = a;
	}
	
	// getter/setter 자동완성 : Source > Generate Getters and Setter
	
}

public class ClassArrayEx17 {

	public static void main(String[] args) {

		PrivateTest obj = new PrivateTest();
		
		//obj.a = 100; 접근불가(is not visible) > private이기 때문에
		obj.b = 200;
		obj.c = 300;
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		
		obj.setA(777); 					// setter를 이용해서 값 대입
		System.out.println(obj.getA()); // getter를 이용하여 값을 꺼내오기
		
	}

}
