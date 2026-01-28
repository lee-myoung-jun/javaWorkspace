package ch03.sec01;

public class IncreaseOp {

	public static void main(String[] args) {
		// 증가감 연산자
		int x = 10;
		int y = 10;
		int z ;
		
		System.out.println("--------------------");
		x++;
		++x;
		System.out.println(x); //x=12
		
		System.out.println("--------------------");
		y--;
		--y;
		System.out.println(y); //x=8
		
		//대입연산자와 같이 사용
		System.out.println("--------------------");
		z = x++;  //z에 먼저 대입 후 x를 증가
		System.out.println("z=" + z);  //12
		System.out.println("x=" + x);  //13
		
		//대입연산자와 같이 사용
		System.out.println("--------------------");
		z = ++x;  //x먼저 증가 z에 대입
		System.out.println("z=" + z);  //14
		System.out.println("x=" + x);  //14
		
		//다른 연산자와 같이 사용(+ 연산과 같이 사용)
		System.out.println("--------------------");
		z = ++x + y++;
		System.out.println("z=" + z);  //15+8
		System.out.println("x=" + x);  //15
		System.out.println("y=" + y);  //9
		
		//비트 반전 연산자
		System.out.println("10을 ~ 연산 적용하면?" + ~10);

	}

}
