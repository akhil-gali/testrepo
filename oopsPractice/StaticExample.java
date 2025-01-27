package oopsPractice;

class Demo{
	int m;
	static int n;
	void assign_m(int m) {
		this.m =m;
		}
	static void assign_n(int temp) {
		n=temp;
	}
	void display() {
		System.out.println("m="+m+"n="+n);
	}
}

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1= new Demo();
		Demo d2= new Demo();
		d1.display();
		d1.assign_m(20);
		d1.display();
		d1.assign_n(30);
		d1.display();
		d2.display();
		d2.assign_n(50);
		d2.display();
		d1.display();
		Demo.n=70;
		d1.display();
		d2.display();
		}

}
