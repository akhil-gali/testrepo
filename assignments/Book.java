package assignments;

public class Book {
	int bno;
	int price;
	String bname;
	Book(){}
	public Book(int bno, String bname, int price) {
		this.bno=bno;
		this.bname=bname;
		this.price=price;
		}
		void display() {
			System.out.println("Book number: "+bno);
			System.out.println("Book name: "+bname);
			System.out.println("Book price: "+price);
		}
}
