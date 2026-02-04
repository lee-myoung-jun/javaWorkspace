package ch12_collection_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			System.out.print("단어를 입력하세요 >> ");
			list.add(i, sc.next());
		}
		
		String aaa = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(aaa.length() < list.get(i).length()) {
				aaa = list.get(i);
			}
		}
		
		System.out.println("-----------------------------");
		System.out.print(list.get(0)+"\t");
		System.out.print(list.get(1)+"\t");
		System.out.print(list.get(2)+"\t");
		System.out.print(list.get(3)+"\n");
		System.out.println("가장 긴 단어는 : " + aaa);
		System.out.println("가장 긴 단어의 길이는 : " + aaa.length());
	}

}
