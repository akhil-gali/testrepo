package javaPractice2025;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				if (i == 100 && i % 2 == 0)
					System.out.println(i);
				else
					System.out.print(i + ", ");

			}
			i++;
		}

	}

}
