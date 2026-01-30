package ex;

import java.util.Scanner;

public class Savings {
	Scanner sc = new Scanner(System.in);
	//예금주, 예금액, 잔액, 이자에 해당하는 값을 저장하기 위한 변수를 각 타입에 맞춰서 생성
	//예금액, 잔액, 이자의 경우 잔액을 반환할때 더해주어야 하기 때문에 임의값 0 설정
	private String name;
	private int deposit = 0;
	private int balance = 0;
	private int interest = 0;
	
	void setName() {  //예금주를 홍길동으로 설정하는 메소드
		name = "홍길동";
	}
	
	void setBalance() {  //입금전 잔액을 10_000으로 설정하는 메소드
		balance = 10_000;
	}

	String getName() {  //예금주명을 반환하는 메소드
		return name;
	}

	void inputDeposit() {  //입력한 예금액을 deposit에 저장하는 메소드
		deposit = sc.nextInt();
	}

	int getInterest() {  //이자를 구해서 반환하는 메소드.  (입금전 잔액+예금액)의 10%
		interest = (int)((balance+deposit)*0.1);
		return interest;
	}

	int getBalance() {  //최종잔액을 구해서 반환하는 메소드.  (잔액+예금액+이자)
		int bal = (int)balance + (int)interest + (int)deposit;
		return bal;
	}
}
