package ch03.sec02;
import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //참조타입 객체 생성
		int time; //몇 초인지 입력한 값을 저장하는 정수형 변수 생성
		
		System.out.print("시간 입력 (초) : "); // 시간 입력
		time = sc.nextInt(); // 값을 입력하면 그 값을 정수로 타입변환해서 위에서 생성한 변수에 저장
		
		// '시간' 은 /연산자 이용하여 몇시간인지 구함(1시간=3600초)
		// '분' 은 먼저 %연산자로 몇시간인지 나눈다음 남은 나머지를 구한다. 그후 나머지를 이용하여 /연산자로 몇분 인지 구함(1분=60초)
		// '초' 는 먼저 %연산자로 몇시간인지 나눈다음 남은 나머지를 구한다. 그후 나머지를 이용하여 %연산자로 몇분인지 나눠서 나머지를 구해준다.
		System.out.print(time + "초는 " + (time/3600) + "시간, " + ((time%3600)/60) + "분, " + ((time%3600)%60) + "초입니다.");

	}

}
