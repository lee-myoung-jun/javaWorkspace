package ex;

import java.util.Random;
import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
		// 0~9까지의 랜덤 숫자 10개 생성하여 배열에 저장. 각 숫자의 반복 횟수 출력
		Random Rd = new Random();  //참조타입 변수 Rd 생성
		int[] num = new int[10];  //랜덤숫자 10개의 값을 저장할 크기가 10인 정수타입 배열 num 생성
		
		for(int i=0; i<num.length; i++) {  //0~9까지의 범위에서 10개의 숫자를 뽑아 배열 num에 저장하는 for문
			num[i] = Rd.nextInt(10);
		}
		
		System.out.println(Arrays.toString(num));  //num에 저장된 랜덤한 10개의 숫자들 출력
		
		//0~9까지 각 숫자를 num[0~9]의 각각의 값들과 비교하여 반복횟수를 구해 출력하는 중첩for문
		for(int a=0; a<=9; a++) {
			int num2 = 0;  //반복횟수를 저장할 정수타입 변수 num2 생성하고, 한번의 검사가 끝나고(밑의for문) 다음검사를 이어가야 하기 때문에 초기값을 0으로 설정
			
			for(int b=0; b<num.length; b++) {
				if(a == num[b]) {  //0~9중 임의의 숫자와 num[0~9]의 각각의 값하고 비교하여 똑같은 수가 나올시 num2를 +1 해준다
					num2 ++;
				}
			}//int b를 쓰는 for문 종료
			
			System.out.println(a + "의 개수 : " + num2); //반복횟수 출력
		}//int a를 쓰는 for문 종료
	}

}
