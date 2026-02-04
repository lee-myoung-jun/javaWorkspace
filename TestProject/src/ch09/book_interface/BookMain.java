package ch09.book_interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
		String title, author;
		int price;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도서정보를 입력합니다");
		System.out.print("제목 입력 : ");
		title = sc.next();
		System.out.print("저자 입력 : ");
		author = sc.next();
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
		
		BookDTO dto = new BookDTO(title, author, price);
		
		BookDAO dao = new BookDAO();
		dao.insertBook(dto);
		
		IBookDAO idao = new BookDAO();
		idao.insertBook(dto);
		
		System.out.println("도서정보를 삭제합니다");
		System.out.print("제목 입력 : ");
		title = sc.next();
		idao.deleteBook(title);
		
		System.out.println("전체 도서정보를 조회합니다");
		ArrayList<BookDTO> ar = idao.getAllBook();
		for(int i=0; i<ar.size(); i++) 
				System.out.println(ar.get(i));
		
		
		System.out.println("도서정보를 조회합니다");
		System.out.print("제목 입력 : ");
		title = sc.next();
		BookDTO bDTO = idao.searchBook(title);
		System.out.println(bDTO);
		
		System.out.println("도서정보를 수정합니다");
		System.out.print("수정 도서 제목 입력 : ");
		title = sc.next();
		bDTO = idao.searchBook(title);
		System.out.println(bDTO);
		
		System.out.print("제목 입력 : ");
		title = sc.next();
		System.out.print("저자 입력 : ");
		author = sc.next();
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
		
		dto = new BookDTO(title, author, price);
		
		idao.updateBook(dto);
	}
}
