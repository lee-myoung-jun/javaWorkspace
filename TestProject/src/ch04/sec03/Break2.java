package ch04.sec03;

public class Break2 {

	public static void main(String[] args) {
		// 중첩 반복문일때 break의 범위
		// 바깥 for문을 지칭하는 label을 붙일 수 있음(별로 권장하지는 않음)
		// 각각의 for문에 break를 거는걸 권장함
		Outter:for (char upper='A'; upper <= 'Z'; upper++) {  // 문자는 유니코드를 갖기 때문에 1씩 올라가는게 가능
			for(char lower='a'; lower <= 'z'; lower++) {
				System.out.print(upper + "-" + lower + "\t");
				if(lower=='g') {
					//break; //중첩 for문 내의 break의 범위 - 가장 가까운 반복범위 lowe의 for문만 탈출하고 upper의 for문은 끝까지 진행
					break Outter;
				}
			}
			System.out.print("\n");
			/*if(upper=='K');
				break;*/
		}

	}

}



















