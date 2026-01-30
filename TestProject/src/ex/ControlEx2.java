package ex;

import java.util.Scanner;

public class ControlEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //참조타입 변수 sc 생성
		int num1 = 0;  //입력한 선택값을 저장하는 정수타입 변수 num1 생성
		int num2 = 0;  //입력한 예금액을 저장하는 정수타입 변수 num2 생성
		int num3 = 0;  //입력한 출금액을 저장하는 정수타입 변수 num3 생성
		int num4 = 0;  //잔고를 저장하는 정수타입 변수 num4 생성
		
		do { //4를 입력하기 전까지 계속해서 반복하는 do~while문(do~while문이라 시작후 바로 종료해도 1번은 실행되서 정상적으로 진행됨)
			//선택메뉴 안내
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			num1 = sc.nextInt();  //번호를 입력하면 입력한 값을 num1에 정수타입으로 저장하고 다음으로 넘어감
		
			switch (num1) {  //num1의 값에 따라 case 1~4,default 실행
			
			case 1:  //입력한 예금액을 num2에 정수타입으로 저장하고 num4에 그만큼 더해줌
				System.out.print("예금액> ");   
				num2 = sc.nextInt();
				System.out.println();
				System.out.println();
				num4 += num2;
				break;
				
			case 2:  //입력한 출금액을 num3에 정수타입으로 저장하고 num4에 그만큼 빼줌
				System.out.print("출금액> ");
				num3 = sc.nextInt();
				System.out.println();
				System.out.println();
				num4 -= num3;
				break;
				
			case 3:  //지금까지 모이고 빠진 잔고를 보여줌
				System.out.print("잔고>" + num4 +"\n");
				while(true) {  //while 무한 반복을 통해 y를 입력하기 전까지 화면 유지
					System.out.print("이전화면으로(y/n) : ");
					char yn = sc.next().charAt(0);  //입력한 값을 문자타입 변수 yn에 저장하고 다음으로 진행
					if(yn=='y') break;  //입력한 값이 y일 경우 while문 break
				}
				break;  //case3 break
				
			case 4:System.out.print("\n프로그램 종료"); break;
			default:   //1~4제외하고 다른걸 입력한 경우 아무것도 없이 다시 반복
			}
		} while (num1 != 4);

	}

}
