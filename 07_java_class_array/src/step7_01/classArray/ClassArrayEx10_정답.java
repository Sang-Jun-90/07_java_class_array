package step7_01.classArray;

import java.util.Random;;

// 경마[문제]


class Horse{
	String name   = ""; 
	int pos       = 0; 
	int rank      = 0;
	boolean isWin = false;
}

class Racing{
	Random ran = new Random();
	int size = 4;
	Horse[] horses = new Horse[size];	
	int line = 20;
	int track [][] = new int[size][line];
	
	void run() {
		
		for (int i = 0; i < horses.length; i++) {
			horses[i] = new Horse();
		}
		horses[0].name = "a";
		
	}
}




public class ClassArrayEx10_정답 {

	public static void main(String[] args) {

	}

}
