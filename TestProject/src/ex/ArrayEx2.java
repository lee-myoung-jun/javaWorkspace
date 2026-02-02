package ex;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 1~45 숫자중 랜덤으로 6개 뽑기. 중복안되고. 배열이용할 것
		Random Rd = new Random();  //참조타입 변수 Rd 생성
		int[] num = new int[6];  //크기가 6인 정수타입 배열 num 생성(랜덤번호 담을 저장소)
		int aaa = 0;  //중복 검사 결과를 확인할 임의 값을 가진 정수타입 변수 aaa 생성
		
		while(aaa != 1) {  //aaa 값이 1이 되지 않는한 계속 반복되는 while문 생성
			//0~44까지의 범위에서 랜덤한 수를 생성해 +1을 해줌으로써 1~45까지의 범위에서 수를 뽑고
			//num에 저장하여 배열 완성.
			for(int i=0; i<num.length; i++) {
				num[i] = Rd.nextInt(45)+1;
			}
			
			
			//중복 검사를 시행하는 중첩 for문
			//검사를 진행하여 중복이 나오면 aaa의 값을 2로 설정하고 for문을 종료 시키면서 while문에 의해 랜덤한 수를 뽑는것부터 다시 실행
			//중복이 나오지 않았다면 aaa의 값을 1로 설정하고 for문을 종료 시키면서 while문 종료
			for(int a=0; a<6; a++) {  //num[0]과 num[1~5]를 비교 해보는 식으로 해서 num[5]과 num[1~5]를 비교하는 것까지 반복해서 확인
				for(int b=0; b<5; b++) {  //num[0]과 num[1]를 비교하는 것에서 num[0]과 num[5]를 비교하는 것까지 반복해서 확인
					if(num[a] == num[b+1]) {  //확인 과정 중 중복값이 나왔을경우 아래 if문 진행
						//a가 0일 때는 문제가 없지만 1부터 5까지의 경우 num[1]==num[1] 이런식의 결과가 나올 수 있음
						//그렇기에 위와 같은 경우가 나왔을 경우 continue를 넣어 해당 반복은 건너뛰고 진행
						if(a == b+1) continue;
						//중복이 나왔다면 aaa에 2를 주고 break를 걸어 해당 반복을 멈춤
						aaa = 2;
						break;
					} else aaa = 1;  // 중복이 나오지 않았다면 aaa를 1로 설정해 계속 검사 하도록 진행
				}//int b를 쓰는 for문의 종료
				
				if(aaa == 2) break;  //aaa가 2가 되었다는건 중복이 나왔다는 뜻이므로 더이상 반복할 필요가 없어 break를 걸어 for문 종료
				
			}//int a 를 쓰는 for문 종료
			
		}//while문 종료
			System.out.println(Arrays.toString(num)); //중복되지않는 랜덤한 6개의 수가 들어있는 num배열의 값 출력
	}

}
