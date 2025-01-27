package assignments;

public class SpecialEditionBook extends Book{
	int discount;
	SpecialEditionBook(){
		
	}
	public SpecialEditionBook(int bno, String bname, int price, int discount) {
		super(bno,bname,price);
		this.discount=discount;
	}
	void display() {
		super.display();
		System.out.println("Discount: "+discount);
	}

}
