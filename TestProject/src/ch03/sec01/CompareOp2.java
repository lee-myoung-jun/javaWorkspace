package ch03.sec01;
import java.util.Scanner;

public class CompareOp2 {

	public static void main(String[] args) {
		// 문자열 비교
		// 문자열 변수 값 비교시 equals() 사용해줘야함.
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";  //여기 참조주소와 userPass의 참조주소가 다름
		String userPass;
		
		System.out.print("비밀번호 입력: ");
		userPass = sc.next();
		
		if(pass == userPass)  // 두 변수가 참조하는 주소가 같냐는 질문과 같음(다르기때문에 false반환)
			{System.out.println("PASS");}
		else
			{System.out.println("No PASS");}
		
		if(pass.equals(userPass))  // 두 변수가 가지고 있는 값이 같냐는 질문과 같음
			{System.out.println("PASS");}
		else
			{System.out.println("No PASS");}
		
		sc.close();

	}

}
















