package ch04.sec02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// while 문 정리
		
		/*while(1==1) {
			//무한반복
		}*/
		
		int i, sum;
		i = 0;
		sum = 0; //변수 선언하고 안에 값을 넣어줘야 비교연산 가능
		while(i<=100) { //조건문안에 변수선언 불가능
			//짝수의 합을 구하려고 하면 i가 0부터 시작하니 2씩 커지게 하면됨
			//홀수면 1부터 시작해서 2씩 커지게 하면됨
			sum += i;
			i += 2;
		}
		
		System.out.println("i값 : " + i + " sum값 : " + sum);
		
		
		//////////////////////////////////
		/// 
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자입력 : ");
		num = sc.nextInt();
		
		while(num != 7) {  //입력값이 7이 아닌동안 반복
			System.out.print("다시 입력 : ");
			num = sc.nextInt();
		}
		
		System.out.print("7 입력. 종료");
		sc.close();

	}

}




















