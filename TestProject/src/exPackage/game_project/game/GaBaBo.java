package exPackage.game_project.game;

import java.util.Random;
import java.util.Scanner;

public class GaBaBo {
	public void gbbGame(){
		Scanner sc = new Scanner(System.in);  //참조객체 sc 생성
		Random Rd = new Random();  //참조객체 Rd 생성
		int you, com;  //임의의 랜덤한 수와 사용자가 입력한 값을 각각 저장할 정수타입 변수 you, com 생성
		char yn = 'y';  //게임을 다시할것인지에 대한 답을 저장할 문자타입 변수 yn 생성
		
		do { //n이 나오지 않는한 반복실행하는 do~while문(게임을 반복해서 할수 있도록함)
			System.out.println("*******************************************");
			System.out.println("\t가위바위보 게임");
			System.out.println("가위 바위 보 게임 : 1.가위, 2.바위, 3.보");
			System.out.println("===========================================");
			System.out.print("번호 입력 : ");
			you = sc.nextInt();  //입력한 번호 저장
			com = (int) (Rd.nextInt(3) + 1);  //0~2범위에서 뽑는걸 +1을 해줌으로서 1~3의 범위에서 랜덤한 수를 생성해 저장
			
			switch (you) {  //입력한 번호에 따라 case를 실행하는 switch문
			case 1: //플레이어가 1.가위를 골랐을 경우
				//컴퓨터가 1~3중에 어떤 숫자를 뽑았는지에 따라 다른 문장을 실행하는 if문
				if (com == 1) { //컴퓨터가 1.가위를 골랐을때
					System.out.println("비겼습니다!");
					System.out.println("컴퓨터는 가위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else if (com == 2) {  //컴퓨터가 2.바위를 골랐을때
					System.out.println("당신이 졌습니다ㅠㅠ");
					System.out.println("컴퓨터는 바위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else {  //컴퓨터가 3.보를 골랐을때
					System.out.println("당신이 이겼습니다^^");
					System.out.println("컴퓨터는 보입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				}  //if문 종료
				break;
				
			case 2: //플레이어가 2.바위를 골랐을 경우
				//컴퓨터가 1~3중에 어떤 숫자를 뽑았는지에 따라 다른 문장을 실행하는 if문
				if (com == 1) { //컴퓨터가 1.가위를 골랐을때
					System.out.println("당신이 이겼습니다^^");
					System.out.println("컴퓨터는 가위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else if (com == 2) {  //컴퓨터가 2.바위를 골랐을때
					System.out.println("비겼습니다!");
					System.out.println("컴퓨터는 바위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else {  //컴퓨터가 3.보를 골랐을때
					System.out.println("당신이 졌습니다ㅠㅠ");
					System.out.println("컴퓨터는 보입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				}  //if문 종료
				break;
				
			case 3: //플레이어가 3.보를 골랐을 경우
				//컴퓨터가 1~3중에 어떤 숫자를 뽑았는지에 따라 다른 문장을 실행하는 if문
				if (com == 1) { //컴퓨터가 1.가위를 골랐을때
					System.out.println("당신이 졌습니다ㅠㅠ");
					System.out.println("컴퓨터는 가위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else if (com == 2) {  //컴퓨터가 2.바위를 골랐을때
					System.out.println("당신이 이겼습니다^^");
					System.out.println("컴퓨터는 바위입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				} else {  //컴퓨터가 3.보를 골랐을때
					System.out.println("비겼습니다!");
					System.out.println("컴퓨터는 보입니다.");
					System.out.print("다시하시겠습니까?(y/n) : ");
					yn = sc.next().charAt(0);  //입력한 문자값 저장
				}  //if문 종료
				break;
				
			default:  //다른 숫자를 입력했을 경우 아래 문구 출력후 다시 반복
				System.out.println("다시 입력해 주십시오");
				break;
			} //switch문 종료
		} while(yn != 'n');  //do~while문 종료
	} //gbbGame() 메소드 종료
}
