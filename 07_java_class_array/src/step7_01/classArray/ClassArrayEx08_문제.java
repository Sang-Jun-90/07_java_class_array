//package step7_01.classArray;
//
//import java.util.Scanner;
//
//class Subject{
//	String name;
//	int score;
//}
//
//class Student{
//	Subject[] subjects;
//	String name;
//}
//
//
//
//public class ClassArrayEx08_문제 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		// # 학생 추가 삭제 컨트롤러
//		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
//		//   김철수 : 과목3개 수학 50 국어50 영어 60 
//		//   이만수 : 과목2개 수학 20 국어 30 
//		//   이영희 : 과목1개 수학 100
//		
//		Student[] stdList = new Student[3];  // 배열 만들기
//		int stdCnt = 0;	// 학생 수
//		
//		while (true) {
//			
//			for (int i = 0; i < stdCnt; i++) {
//				System.out.println("[" + (i+1) + "]"  + stdList[i].name + "학생 >>");
//				if (stdList[i].subjects != null) {
//					for (int j = 0; j < stdList[i].subjects.length; j++) {
//						System.out.println("[" + (j+1) + "]"  + stdList[i].subjects[j].name + "과목");
//					}
//				}
//			
//			}
//			
//			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
//			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
//			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
//			System.out.println("[4]종료하기");
//			System.out.print("선택 : ");
//			int choice = scan.nextInt();
//			
//			if		(choice == 1) {
//				System.out.print("이름 : ");
//				String name = scan.next();
//				
//				stdList[stdCnt] = new Student();  // 생성자 만들기
//				stdList[stdCnt].name = name;
//				stdCnt++;
//				
//			}
//			else if (choice == 2) {
//			
//				for (int i = 0; i < stdCnt; i++) System.out.println((i+1) + " " + stdList[i].name);
//				
//				System.out.print("학생 선택 : ");
//				int input = scan.nextInt();
//				input--;
//				
//				System.out.print("과목 입력 : ");
//				String subject = scan.next();				
//				
//				if (stdList[input].subjects == null) {
//					
//					stdList[input].subjects = new Subject[1]; // 배열 만들기
//					stdList[input].subjects[0] = new Subject();
//					stdList[input].subjects[0].name = subject;
//				}
//				else {
//					int size = stdList[input].subjects.length;
//					
//					Subject[] temp = stdList[input].subjects;
//					stdList[input].subjects = new Subject[size+1];
//					
//					for (int i = 0; i < temp.length; i++) {
//						stdList[input].subjects[i]=temp[i];
//					}
//					
//					stdList[input].subjects[size] = new Subject();
//					stdList[input].subjects[size].name = subject;
//					
//					temp = null;
//				}
//				
//			}
//			else if (choice == 3) {
//				
//				for (int i = 0; i < stdCnt; i++) {
//					System.out.println("[" + (i+1) + "]" + stdList[i].name +"학생");
//				}
//				System.out.print("학생 선택 : ");
//				int stuchoice = scan.nextInt();
//				stuchoice--;
//				if (stdList[stuchoice].subjects != null) {
//					for (int i = 0; i < stdList[stuchoice].subjects.length; i++) {
//						System.out.println("[" + (i+1) + "]" + stdList[stuchoice].subjects[i].name +"학생");
//					}
//				}
//				System.out.print("과목 선택 : ");
//				int num = scan.nextInt();
//				num--;
//				
//				System.out.print("성적 입력 : ");
//				int score = scan.nextInt();
//				
//				stdList[stuchoice].subjects[num].score = score;
//				
//				
//			}
//			else break;
//			
//		}
//
//
//	}
//
//}
