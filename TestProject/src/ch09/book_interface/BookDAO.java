package ch09.book_interface;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("도서 정보가 등록되었습니다");
		System.out.println(dto.getTitle() + "\t" + dto.getAuthor()
							+ "\t"+ dto.getPrice());
	}
	
	@Override
	public void deleteBook(String title) {
		System.out.println("도서 정보가 삭제되었습니다");
	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
		return null;
	}

	@Override
	public BookDTO searchBook(String title) {
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		System.out.println("도서 정보 수정이 완료되었습니다");
	}
	
	
	
	
	
	
	
	
/*
    @Override
    public void insertBook(BookDTO dto) {
        System.out.println("--- [DB] INSERT 쿼리 실행 ---");
        System.out.println("저장할 도서: " + dto.getTitle());
        System.out.println("도서 등록이 완료되었습니다.");
    }

    @Override
    public void deleteBook(String isbn) {
        System.out.println("--- [DB] DELETE 쿼리 실행 ---");
        System.out.println("삭제할 도서 ISBN: " + isbn);
        System.out.println("도서 삭제가 완료되었습니다.");
    }

    @Override
    public ArrayList<BookDTO> getAllBook() {
        System.out.println("--- [DB] SELECT ALL 쿼리 실행 ---");
        System.out.println("전체 도서 목록을 가져옵니다.");
        
        // 실제 동작 테스트를 위해 비어있는 리스트 반환
        return new ArrayList<BookDTO>();
    }

    @Override
    public BookDTO searchBook(String title) {
        System.out.println("--- [DB] SELECT ONE 쿼리 실행 ---");
        System.out.println("검색 키워드: " + title);
        
        // 검색되었다고 가정하고 더미 데이터 반환 (실제로는 DB에서 조회된 값)
        return new BookDTO("979-11", title, "미상", "가상의 출판사", 15000);
    }

    @Override
    public void updateBook(BookDTO dto) {
        System.out.println("--- [DB] UPDATE 쿼리 실행 ---");
        System.out.println("수정할 도서 ISBN: " + dto.getIsbn());
        System.out.println("수정된 가격: " + dto.getPrice());
        System.out.println("도서 정보 수정이 완료되었습니다.");
    }
*/
}
