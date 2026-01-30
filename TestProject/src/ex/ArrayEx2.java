package ex;

import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1~45 숫자중 랜덤으로 6개 뽑기. 중복안되고. 배열이용
		Random Rd = new Random();
		int[] num = new int[6];
		int aaa = 0;
		
		while(aaa != 1) {
			for(int i=0; i<num.length; i++) {
				num[i] = Rd.nextInt(45)+1;
			}
			
			for(int a=0; a<6; a++) {
				for(int b=0; b<6; b++) {
					if(num[a] == num[b+1]) {
						aaa = 2;
						break;
					} else aaa = 1;
				}
				if(aaa == 2) break;
			}
		}
	}

}
