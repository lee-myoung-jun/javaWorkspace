package exPackage.game_project.start;

import java.util.Scanner;
import exPackage.game_project.info.*;  //exPackage.game_project 패키지 안에있는 info패키지의 모든 클래스를 import
import exPackage.game_project.game.*;  //exPackage.game_project 패키지 안에있는 game패키지의 모든 클래스를 import

public class AppStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //참조객체 sc 생성
		AppInfo app = new AppInfo();  //AppInfo.java를 참조하는 객체 app 생성
		GaBaBo gbb = new GaBaBo();  //GaBaBo.java를 참조하는 객체 app 생성
		Guess gue = new Guess();  //Guess.java를 참조하는 객체 app 생성
		int num;  //입력한 메뉴번호를 저장할 정수타입 변수 num 생성
		char yn;  //게임시작여부에 대해 입력한 값을 저장할 문자타입 변수 yn 생성
		
		System.out.println("*******************************************");
		System.out.println("\t★★게임에 오신 것을 환영합니다^^");
		
		do { //4를 입력하기 전까지 반복하는 do~while문
			System.out.println("*******************************************");
			System.out.println("\t\t메뉴");
			System.out.println("-------------------------------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("-------------------------------------------");
			System.out.print("메뉴 번호 입력 : ");
			num = sc.nextInt();  //입력한 메뉴 번호 값 저장
			
			switch (num) { //입력한 메뉴 번호 값에 따라 case를 실행하는 switch문
			case 1:
				app.info();  //AppInfo.java의 info 메소드 실행
				break;
			case 2:
				app.gbbInfo();  //AppInfo.java의 gbbinfo 메소드 실행
				yn = sc.next().charAt(0);  //게임을 시작할것인지에 대한 답을 저장
				if(yn=='y') {  //y라고 답했다면 게임을 실행하는 if문
					gbb.gbbGame();  //GaBaBo.java의 gbbGame 메소드 실행
				}
				break;
			case 3:
				app.gueInfo();  //AppInfo.java의 gueinfo 메소드 실행
				yn = sc.next().charAt(0);  //게임을 시작할것인지에 대한 답을 저장
				if(yn=='y') {  //y라고 답했다면 게임을 실행하는 if문
					gue.gueGame();  //Guess.java의 gueGame 메소드 실행
				}
				break;
			case 4:  //4를 입력했다면 다음과 같은 문구를 출력하고 while문 종료
				System.out.println("*******************************************");
				System.out.println("종료합니다!");
				System.out.println("*******************************************");
				break;
			default:  //다른 숫자를 입력했을시 다음과 같은 문구를 출력하고 다시 반복
				System.out.println("다시 입력해주세요.");
				break;
			}
		} while(num != 4);  //do~while문 종료
		sc.close();  //Scanner 닫기
	}
}
