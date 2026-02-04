package ch12_collection_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList listAr = new ArrayList();
		List list = new ArrayList();
		
		//배열의 마지막에 추가
		list.add(100);
		list.add("홍길동");
		list.add(5.77);
		list.add('a');
		
		//size() : 컬렉션 내 객체의 개수 반환
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //object 타입으로 진행되었음
		}
		
		System.out.println();
		
		//특정 인덱스에 요소를 추가 하려면
		list.add(0, "변경"); //모든 요소들이 하나씩 뒤로 이동함(덮어씌우는게 아닌 끼워넣는식)
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //object 타입으로 진행되었음
		}
		
		System.out.println();
		
		//특정 인덱스의 요소를 삭제 하려면
		list.remove(1); //삭제 이후 뒤에 요소들이 앞으로 와서 빈자리를 채움
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //object 타입으로 진행되었음
		}
		
		System.out.println();
		//특정 요소가 리스트 내 항목으로 포함되어 있는지 여부 확인
		System.out.println(list.contains("홍길동"));
		//검사한 요소가 없으면 추가
		if(!(list.contains("홍길동"))) {
			list.add("홍길동");
		}
	}
}



















