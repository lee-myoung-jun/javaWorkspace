package ch12_collection_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		// ArrayList 제네릭타입 사용
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet/jsp");
		list.add(2, "database");
		list.add("mybatis");
		//list.add(30);  //타입 안맞음 - 에러
		
		//항목수 반환
		int size = list.size();
		System.out.println("총 항목 수 : " + size);
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str); //String 타입으로 구체화
		}
		
		System.out.println();
		String skill = list.get(2);
		System.out.println(2 + ":" + skill);
		
		//중간 공간을 비워놓지 않는다 : 이동이 발생
		list.remove(2);  //빈자리는 뒤에서 밀고 들어옴
		list.remove(2);
		list.remove("mybatis");  //특정항목 삭제
		
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str); //String 타입으로 구체화
		}
		
		System.out.println();
		for(String value : list) {
			System.out.println(value);
		}
		
		//문자열 : 문자열 개수 반환 (length())
		System.out.println();
		System.out.println("각 항목의 문자 수");
		for(String value : list) {
			System.out.println(value + ":" + value.length());
		}
	}

}















