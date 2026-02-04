package ch09.book_interface;

import java.util.ArrayList;

public interface IBookDAO {
    
    // 도서 등록
    public void insertBook(BookDTO dto);
    
    // 도서 삭제
    public void deleteBook(String title);
    
    // 도서 전체 목록 조회
    public ArrayList<BookDTO> getAllBook();
    
    // 도서 검색
    public BookDTO searchBook(String title);
    
    // 도서 정보 수정
    public void updateBook(BookDTO dto);
}
