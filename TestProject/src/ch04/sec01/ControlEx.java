package ch04.sec01;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //참조타입 변수 sc 생성
		int num1, num2, num3; //상품가격(num1)과 주문수량(num2), 총주문액수(num3)를 구하기 위해 정수타입 변수 각각 생성
		String name;  //상품명을 구하기 위해 문자열 타입 변수 생성
		
		//상품 정보 및 상품번호 입력 안내
		System.out.println("******* 상품 정보 *******");
		System.out.println("1 노트북 : 1,200,000 원");
		System.out.println("2 디지털카메라 : 400,000 원");
		System.out.println("************************");
		System.out.print("상품번호 입력 : ");
		num1 = sc.nextInt(); // 상품번호를 입력하면 그값이 정수타입으로 num1에 저장되고 다음으로 넘어감
		
		if(num1==1 || num1==2) {  // 1,2번을 고른 건지 그외에 다른걸 고른건지 확인하는 if문. 1,2번을 골랐다면 그대로 진행 아니라면 else로 이동
			if(num1==1) {  // 1번을 골랐다면 nume1과 name에 각각 상품의 가격과 상품명을 저장한다.
				num1 = 1_200_000;
				name = "노트북";
			} else {  // 2번을 골랐다면 nume1과 name에 각각 상품의 가격과 상품명을 저장한다.
				num1 = 400_000;
				name = "디지털카메라";
			}
			
			//주문수량 입력 안내
			System.out.print("주문 수량 입력 : ");
			num2 = sc.nextInt();  // 주문 수량을 입력하면 그값이 정수타입으로 num2에 저장되고 다음으로 넘어감
			num3 = num1*num2;  // 저장된 상품의 가격(num1)과 주문수량(num2)를 곱해 총 주문액을 num3에 저장한다.
			System.out.println("************************");
			
			if(num3 >= 1_000_000) {  // 총 주문액이 백만원을 넘어가면 할인율 10%를 적용하여 아래와 같이 출력
				System.out.println("상품명 : " + name);
				System.out.println("가격 : " + num1 + " 원");
				System.out.println("주문 수량 : " + num2 + " 개");
				System.out.println("주문액 : " + num3 + " 원");
				System.out.println("할인액 : " + (num3*0.1) + " 원");  //할인율 10% 적용
				System.out.println("총지불액 : " + (num3-(num3*0.1)) + " 원");
				
			} else if(num3 >=500_000) {  // 총 주문액이 오십만원을 넘어가면 할인율 5%를 적용하여 아래와 같이 출력
				System.out.println("상품명 : " + name);
				System.out.println("가격 : " + num1 + " 원");
				System.out.println("주문 수량 : " + num2 + " 개");
				System.out.println("주문액 : " + num3 + " 원");
				System.out.println("할인액 : " + (num3*0.05) + " 원");  //할인율 5% 적용
				System.out.println("총지불액 : " + (num3-(num3*0.05)) + " 원");	
				
			} else {  // 총 주문액이 오십만원이하면 할인율을 적용하지 않고 아래와 같이 출력
				System.out.println("상품명 : " + name);
				System.out.println("가격 : " + num1 + " 원");
				System.out.println("주문 수량 : " + num2 + " 개");
				System.out.println("주문액 : " + num3 + " 원");
				System.out.println("총지불액 : " + num3 + " 원");	
			}
			
		} else  //1,2번 이외에 다른걸 골랐다면 다음 문구 출력하고 종료
			System.out.print("잘못 입력하였습니다. 종료합니다.");
		
		sc.close(); //Scanner 종료
	}

}
