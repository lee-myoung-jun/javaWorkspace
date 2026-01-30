package ex;

public class SavingsMain {

	public static void main(String[] args) {
		Savings sav = new Savings();  //인스턴스 생성
		
		sav.setName();  //예금주 설정하는 메소드
		sav.setBalance();  //입금전 잔액 설정하는 메소드
		System.out.println("예금주 : " + sav.getName());  //예금주값을 반환
		System.out.println("입금전 잔액 : " + sav.getBalance());  //최종잔액을 반환(예금액과 이자를 구하기 전이라입금 전 잔액만 나옴)
		System.out.print("예금액 입력 : "); sav.inputDeposit();  //예금액 입력하고 그 값을 저장하는 메소드
		System.out.println("이자 : " + sav.getInterest());  //이자를 구해서 반환하는 메소드
		System.out.println("최종 잔액 : " + sav.getBalance());  //최종잔액을 반환하는 메소드

	}

}
