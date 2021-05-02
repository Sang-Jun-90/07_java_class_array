package step7_01.classArray;

import java.util.Random;
import java.util.Scanner;

// 생성자를 이용한 멤버 변수 초기화
class Fruit {
	
	String name;
	int price;
	static int num;
	
	Fruit(String name , int price) {
		this.name  = name;
		this.price = price;
		num++;
		System.out.println("[" + num + "]");
	}
	
	void printData() {
		System.out.println("이름 : " + this.name);
		System.out.println("가격 : " + this.price);
	}
	
	
}


public class ClassArrayEx15 {

	public static void main(String[] args) {

		Fruit apple = new Fruit("사과", 800); // 생성자를 이용한 멤버변수 초기화
		apple.printData();
		
		Fruit banana = new Fruit("바나나", 2500);
		banana.printData();
		
	}

}
