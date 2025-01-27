package assignments;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(123, "Introduction to Java", 3000);
		SpecialEditionBook seBook = new SpecialEditionBook(123, "Introduction to Java", 3000, 1000);
		book.display();
		seBook.display();

	}

}
