package step7_01.classArray;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */
class Fruit2 {
	
	String name;
	int price;
	
	// Fruit2 기본 생성자
	Fruit2(){
		
	}
	
	// 생성자 오버로딩
	Fruit2(String name) {
		this.name = name;
	}
	
	// 생성자 오버로딩
	Fruit2(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void returnFruit() {
		System.out.println(name +" : " + price);
	}
	
}


public class ClassArrayEx16 {

	public static void main(String[] args) {

		new Fruit2();
		Fruit2 apple = new Fruit2("사과");
		Fruit2 grape = new Fruit2("운악산 포도", 50000);
		
		
		System.out.println(apple.name);
		apple.returnFruit();
		grape.returnFruit();
		
	}

}
