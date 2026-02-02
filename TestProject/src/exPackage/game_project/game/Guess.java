package exPackage.game_project.game;

import java.util.Random;
import java.util.Scanner;

public class Guess {
	public void gueGame() {
		Scanner sc = new Scanner(System.in);  //참조객체 sc 생성
		Random Rd = new Random();  //참조객체 Rd 생성
		int you, com;  //임의의 랜덤한 수와 사용자가 입력한 값을 각각 저장할 정수타입 변수 you, com 생성
		char yn = 'y';  //게임을 다시할것인지에 대한 답을 저장할 문자타입 변수 yn 생성
		
		do { //n이 나오지 않는한 반복실행하는 do~while문(게임을 반복해서 할수 있도록함)
			System.out.println("*******************************************");
			System.out.println("\t숫자알아맞히기 게임");
			System.out.println("-------------------------------------------");
			System.out.println("어떤 숫자일까요? 알아 맞혀보세요^^(1~10)");
			System.out.println("-------------------------------------------");
			System.out.print("숫자 입력 : ");
			you = sc.nextInt();  //입력한 값 저장
			com = (int)(Rd.nextInt(10) + 1);  //0~9범위에서 뽑는걸 +1을 해줌으로서 1~10의 범위에서 랜덤한 수를 생성해 저장

			while (you != com) {  //랜덤한 숫자와 입력한 값이 같지 않는한 계속 반복되는 while문
				System.out.println("-------------------------------------------");
				System.out.print("아닙니다 다시 맞혀보세요^^ 다시 입력 : ");
				you = sc.nextInt();  //여기서 입력한 값으로 다시 저장
			} //while문 종료
			
			//while문이 종료되었다면 랜덤한 숫자와 입력한 값이 같다는 뜻이기에 정답처리함
			System.out.println("-------------------------------------------");
			System.out.println("정답입니다! 나의 숫자는 " + com + "입니다");
			System.out.print("다시하시겠습까?(y/n) : ");
			yn = sc.next().charAt(0);  //다시 할건지에 대한 답 저장
			
		} while(yn != 'n');  //do~while문 종료
	} //gueGame() 메소드 종료
}
