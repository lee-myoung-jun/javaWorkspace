package ch12_collection_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		//고정된 객체들로 ArrayList 구성
		//항목값이 고정됨 : 추가, 삭제불가능 함
		//상수와 비슷한 개념
		List<String> list1 = Arrays.asList("홍길동","신길동","엄길동");
		for(String name:list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		//list1.add("엄준식");
		//list1.remove(1);
		//고정된 객체들로 구성되어 있기때문에 추가 제거 불가능
		for(String name:list1) {
			System.out.println(name);
		}
		
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int num:list2) {
			System.out.println(num);
		}

	}

}

















