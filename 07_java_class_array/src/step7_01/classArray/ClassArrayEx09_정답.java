package step7_01.classArray;

import java.util.Arrays;
import java.util.Random;

// 중복숫자금지 [문제]

/*
class RanNum{
	int num;
}
*/

public class ClassArrayEx09_정답 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
		
		RanNum[] arr = new RanNum[5];
		Boolean[] check = new Boolean[5];
		for (int i = 0; i < check.length; i++) {
			check[i] = false;
		}
		int i = 0;
		while (i < 5) {
			arr[i] = new RanNum();
			int ranNum = ran.nextInt(5);
			if (check[ranNum] == false) {
				check[ranNum] = true;
				arr[i].num = ranNum+1;
				i++;
			}
		}

		

			
		for (int j = 0; j < check.length; j++) {
			System.out.println(arr[j].num);
		}
		

	}

}
