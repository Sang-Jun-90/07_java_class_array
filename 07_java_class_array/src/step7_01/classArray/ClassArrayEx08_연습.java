package step7_01.classArray;

import java.util.Scanner;

class Subject{
	String name;
	int score;
}

class Student{
	Subject[] subjects;
	String name;
}



public class ClassArrayEx08_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student[] stdList = new Student[3];  // 배열 만들기
		int stdCnt = 0;	// 학생 수
		
		while (true) {
			
			for (int i=0; i<stdCnt; i++) {
				System.out.println("[" + (i+1) + "]" + stdList[i].name + "학생>>>");
				if (stdList[i].subjects != null) {
					for (int j=0; j<stdList[i].subjects.length; j++) {
						System.out.println("[" + (j+1) + "]" + stdList[i].subjects[j].name + "과목 = " + stdList[i].subjects[j].score + "점");
					}
				}
				System.out.println();
			}
			
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			System.out.print("선택 : ");
			int choice = scan.nextInt();

			if (choice == 1) {
				System.out.print("이름 : ");
				String inputName = scan.next();
				stdList[stdCnt] = new Student();
				stdList[stdCnt].name = inputName;
				stdCnt++;
			}
			else if (choice == 2) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+ (i+1) +"]" + stdList[i].name);
				}
				System.out.print("학생 선택 : ");
				int choiceStudent = scan.nextInt();
				choiceStudent--;
				System.out.print("과목 입력 : ");
				String input = scan.next();
				
				// 과목이 없는 경우
				if (stdList[choiceStudent].subjects == null) {
					stdList[choiceStudent].subjects = new Subject[1];
					stdList[choiceStudent].subjects[0] = new Subject();
					stdList[choiceStudent].subjects[0].name = input;
				}
				// 과목이 있는 경우
				else {
					int size = stdList[choiceStudent].subjects.length;
					
					Subject[] temp = stdList[choiceStudent].subjects;
					stdList[choiceStudent].subjects = new Subject[size+1];
					
					for (int i = 0; i < size; i++) {
						stdList[choiceStudent].subjects[i] = temp[i];
					}
					stdList[choiceStudent].subjects[size] = new Subject();
					stdList[choiceStudent].subjects[size].name = input;
					temp = null;
					
				}
				
			}
			else if (choice == 3) {
				
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("[" + (i+1) + "]" + stdList[i].name);
				}
				System.out.print("학생선택");
				int choiceStudent = scan.nextInt();
				choiceStudent--;
				
				for (int i = 0; i < stdList[choiceStudent].subjects.length; i++) {
					System.out.println("[" + (i+1) + "]" + stdList[choiceStudent].subjects[i].name);
				}
				System.out.print("과목선택");
				int choiceSubject = scan.nextInt();
				choiceSubject--;
				
				System.out.print("점수 입력 : ");
				int score = scan.nextInt();
				
				stdList[choiceStudent].subjects[choiceSubject].score = score;
				
			}
			else break;
			
		}


	}

}
