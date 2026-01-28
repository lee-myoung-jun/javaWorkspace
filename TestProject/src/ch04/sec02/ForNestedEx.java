package ch04.sec02;

public class ForNestedEx {

	public static void main(String[] args) {
		// n*m=(n*m) 이런 식으로 한줄 전부 쓰고 끝나면 줄바꿈 후 다시 반복
		for(int m=1; m<=9; m++) {  //m은 1부터 시작해서 9가 될때까지 1씩 커지며 아래 for문 반복
			for(int n=2; n<=9; n++) { //n은 2부터 시작해서 9가 될때까지 1씩 커지며 아래 print 반복
				System.out.print(n + "x" + m + "=" + (n*m) + "\t");
			}
			System.out.print("\n");
		}
		
	}

}
