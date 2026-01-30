package ch05.sec01;

import java.util.Scanner;

public class ArrayInput1 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 여러 데이터의 저장
		
		//printf("넣을문자", 변수) - 보통 표시할때 ("nums[" + i + "]") 이런식으로 할텐데
		//위에걸 쓰면 ("nums[%d]",i) 요런식으로 쓰면 됨
		//변수넣을 위치에 %d(d-정수 f-실수 s-문자열 등등 %뒤에 붙이셈) 그리고 그 %d에 들어갈 변수를 ,다음에 설정
		//여러개의 변수 넣을수도 있음(순서만 잘 맞추면 됨)
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("숫자 입력 : ");
		for(int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] : ", i);  //%는 결정되지 않은 format 문자 기호, 실행도중 값이 결정됨 %d:정수  %f:실수
			nums[i] = sc.nextInt();
		}
		
		System.out.println("\n입력된 값 출력");
		for(int i=0; i<nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);  //%는 결정되지 않은 format 문자 기호, 실행도중 값이 결정됨 %d:정수  %f:실수
		}
		sc.close();
	}

}















