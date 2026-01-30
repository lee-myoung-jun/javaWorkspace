package ex;

import java.util.Scanner;

public class Aarray2DEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //참조타입 변수 sc 생성
		String answer;  // 입력한 값을 저장할 문자열타입 변수 answer 생성
		//문제와 답의 대한 값을 가진 문자열타입의 2차원 배열 key 생성
		String [][] key = {{"chair","의자"},{"computer","컴퓨터"},{"integer","정수"}};
		
		for(int i=0; i<3; i++) {  //문제와 입력한 값을 비교하는 문장이 3번 반복
			System.out.print("Q" + (i+1) + ". " + key[i][0] + "의 뜻은? : ");
			answer = sc.next();
			
			if(answer.equals((key)[i][1])) {  //입력한 값이 key에 저장된 값과 같다면 정답처리 아니면 오답처리
				System.out.println("정답입니다.\n");
			} else {
				System.out.println("틀렸습니다. 정답은 " + key[i][1] + "입니다.\n");
			}
		}
	}

}
