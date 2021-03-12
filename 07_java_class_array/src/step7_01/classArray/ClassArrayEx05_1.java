package step7_01.classArray;

import java.util.Scanner;

public class ClassArrayEx05_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int MAX_NUM = 100;	 // final int NAME = 00 >> 절대로 안바뀌게 설정하는 방법
		
		User2[] user2 = new User2[MAX_NUM];	
		
		for (int i = 0; i < MAX_NUM; i++) {
			user2[i] = new User2();
		}
		
		int usrCnt = 0;
		
		while (true) {
			
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.println("이름을 입력하세요 ");
				user2[usrCnt].id = scan.next();
				System.out.println("금액을입력하세요 ");
				user2[usrCnt].money = scan.nextInt();
				usrCnt++;
			}
			else if (sel == 2) {
				System.out.println("인덱스 ");
				int index = scan.nextInt();
				for (int i = index; i < usrCnt - 1; i++) {
					user2[i] = user2[i+1];
				}
				usrCnt--;
			}
				
			else if (sel == 3) {
				for (int i = 0; i < usrCnt; i++) {
					System.out.println(user2[i].id + user2[i].money);
				}
			}
		
			else if (sel == 4) {
				break;
			}
			
		}

		scan.close();
		
	}

}
