package ch05.sec01;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInputEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //참조타입 변수 sc 생성
		int[] nums = new int[5];  // 입력된 숫자를 저장할 크기가 5인 정수타입 배열 nums 생성
		int num2 = 0;  // 최대값을 저장할 정수타입 변수 num2 생성
		
		//숫자 입력 안내
		System.out.println("숫자 입력");
		for(int i=0; i<nums.length; i++) {  // nums의 최대 크기까지 반복(5번)
			System.out.printf("num[%d] : ", i);  //printf 이용
			nums[i] = sc.nextInt();  //nums 배열에 할당된 공간에 입력된 값을 저장
		}
		
		num2 = nums[0];  //숫자를 전부 입력받았다면 배열의 첫번째 값을 최대값으로 설정
		for(int j=1; j<nums.length; j++) {  //총 4번의 비교 반복
			// 임의로 정한 최대값을 nums[1]부터 차례대로 비교하여 기존의 최대값보다 크다면 그 수를 새로운 최대값으로 설정
			if(num2 < nums[j])
				num2 = nums[j];
		}
		
		System.out.println("입력된 값 : " + Arrays.toString(nums)); //nums 배열값 전부 출력
		System.out.println("최대값 : " + num2);  // 최대값 출력
		sc.close(); //Scanner 종료

	}

}
