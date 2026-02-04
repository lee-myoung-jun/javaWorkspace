package ch09.book_interface;

public class BookDTO {
	    private String title;     // 제목
	    private String author;    // 저자
	    private int price;        // 가격

	    // 필드 초기화 생성자
	    public BookDTO(String title, String author, int price) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	    }

	    // Getter & Setter

		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		

		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		

		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
