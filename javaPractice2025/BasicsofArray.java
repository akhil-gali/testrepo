package javaPractice2025;

import java.util.Scanner;

public class BasicsofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the array :");
			int size = sc.nextInt();
			int[] tempArray = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the " + i + " th value of the array :");
				tempArray[i] = sc.nextInt();
			}
		System.out.println("values of the array are: ");

		for (int i = 0; i < tempArray.length; i++) {
			System.out.println(tempArray[i]);
		}
		System.out.println(" values displaying using for each loop");
		for (int x : tempArray) {
			System.out.println(x);
		}
	}

}
