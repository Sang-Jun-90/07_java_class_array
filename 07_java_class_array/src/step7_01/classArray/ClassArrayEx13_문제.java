//package step7_01.classArray;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//class StudentEx{
//	
//	String id = "";
//	String pw = "";
//	
//	void set_data(String id , String  pw) {
//		this.id = id; 
//		this.pw = pw;
//	}
//	
//	
//	void print_data() {
//		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
//	}
//	
//}
//
//class Manager{
//	
//	StudentEx[] list = null;
//	int stdCnt = 0;
//	
//	void add_StudentEx(StudentEx st) {
//		
//		if (stdCnt == 0) {
//		list = new StudentEx[1];
//	}
//	else if (stdCnt > 0) {
//		StudentEx[] temp = list;
//		list = new StudentEx[stdCnt + 1];
//		for (int i = 0; i < stdCnt; i++) {
//			list[i] = temp[i];
//		}
//		temp = null;
//	}
//	list[stdCnt] = st;
//	stdCnt++;
//		
//	}
//	
//	StudentEx remove_StudentEx (int index) {
//		
//		StudentEx temp = list[index];
//		
//		if (stdCnt == 1) list = null;
//		else if (stdCnt > 1) {
//			StudentEx[] tempList = list;
//			list = new StudentEx[stdCnt-1];
//			
//			for (int i = 0; i < index; i++) {
//				list[i] = tempList[i];
//			}
//			for (int i = index; i < stdCnt-1; i++) {
//				list[i] = tempList[i+1];
//			}
//			tempList = null;
//		}
//		stdCnt--;
//		return temp;
//		
//	}
//	
//	int check_id(StudentEx st) {
//		
//		int check = -1;
//		for (int i = 0; i < stdCnt; i++) {
//			if (list[i].id.equals(st.id)) {
//				check = i;
//				break;
//			}
//		}
//		return check;
//		
//	}
//	
//	void print_StudentEx() {
//		
//		for (int i = 0; i < stdCnt; i++) {
//			list[i].print_data();
//		}
//		
//	}	
//	
//	String out_data() {
//		
//		String data = "";
//		if (stdCnt == 0) return data;
//		data+=stdCnt;
//		data+="\n";
//		
//		for (int i = 0; i < stdCnt; i++) {
//			data += list[i].id;
//			data += " , ";
//			data += list[i].pw;
//			if (stdCnt - 1 != i) {
//				data += "\n";
//			}
//			
//			
//		}
//		
//		return data;
//	}
//	
//	void sort_data() {
//		
//		if (stdCnt < 2) System.out.println("정렬할게 없어요");
//		else {
//		}
//		
//	}
//	
////	void load_StudentEx (StudentEx [] temp , int count) {}
//	
//}
//
//
//public class ClassArrayEx13_문제 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		Manager manager = new Manager();
//		
//		// Manager manager = new Manager();
//		
//		while (true) {
//			
//			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
//			int sel = scan.nextInt();
//			
//			/*
//			 * [1] 가입하기 : ID 중복검사 구현
//			 * [2] 탈퇴하기 : ID를 입력받아 탈퇴
//			 * [3] 정렬하기 : 이름을 국어사전 순으로 정렬
//			 * [4] 출력하기 : 데이터들을 화면에 출력
//			 * [5] 저장하기 : 아래와 같은 형식으로 저장
//			 * [6] 불러오기 : 파일에 저장된 내용을 불러오기
//			 * [7] 종료하기 : 반복문을 종료
//			 * 
//			 * 			예) 
//			 * 			2				// 회원 수
//			 *			qwer,1234		// id,pw	
//			 *			abcd,1111		// id, pw
//			 */
//			
//			if		(sel == 1) {
//				
//				StudentEx temp = new StudentEx();
//				System.out.print("아이디 입력 : ");
//				temp.id = scan.next();
//				
//				int check = manager.check_id(temp);
//				
//				if (check == -1) {
//					System.out.print("비번은 : ");
//					temp.pw = scan.next();
//					
//					manager.add_StudentEx(temp);
//					System.out.println(temp.id + "님 환영해요.");
//					
//				}
//				else {
//					System.out.println("중복아이디입니다.");
//				}
//				
//				
//			}
//			else if (sel == 2) {
//				manager.print_StudentEx();
//				StudentEx temp = new StudentEx();
//				System.out.println("아이디는?");
//				temp.id = scan.next();
//				int check = manager.check_id(temp);
//				
//				if (check == -1) {
//					System.out.println("없는 뎁쇼");
//				}
//				else {
//					StudentEx del_st = manager.remove_StudentEx(check);
//					System.out.println(del_st.id + "님 탈퇴되었어요.");
//				}
//				
//			}
//			else if (sel == 3) {
//				manager.sort_data();
//				manager.print_StudentEx();
//			}
//			else if (sel == 4) {
//				
//				manager.print_StudentEx();
//				
//			}
//			else if (sel == 5) {
//				
//				if (manager.stdCnt == 0) continue;
//				
//				try {
//					FileWriter fw = new FileWriter("StudentEx_manager.txt");
//					String data = manager.out_data();
//					if (!data.equals("")) {
//						fw.write(data);
//						System.out.println(data);
//					}
//					fw.close();
//					
//				} catch (IOException e) {e.printStackTrace();}
//				
//			}
//			else if (sel == 6) {
//				
//				File file = new File("StudentEx_manager.txt");
//				if (file.exists()) {
//					
//					try {
//						FileReader fr = new FileReader(file);
//						BufferedReader br = new BufferedReader(fr);
//						
//						String line = null;
//						try {
//							line = br.readLine();
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						int count = Integer.parseInt(line);
//						StudentEx[] temp = new StudentEx[count];
//						
//						for (int i = 0; i < count; i++) {
//							temp[i] = new StudentEx();
//							try {
//								line = br.readLine();
//							} catch (IOException e) {
//								// TODO Auto-generated catch block
//								e.printStackTrace();
//							}
//							String value[] = line.split(",");
//							temp[i].id = value[0];
//							temp[i].pw = value[1];
//							
//						}
//						try {
//							br.close();
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						try {
//							fr.close();
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//						
//					} catch (FileNotFoundException e) {e.printStackTrace();}
//					
//				}
//				
//				
//			}
//			else if (sel == 7) { 
//				break; 
//			}
//			
//		}
//
//	}
//
//}
