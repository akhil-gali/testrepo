package javaPractice2025;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter item number: ");
		int itemNumber= sc.nextInt();
		System.out.println("please enter item name: ");
		String itemName = sc.next();
		System.out.println("please enter item rate: ");
		double itemRate= sc. nextDouble();
		System.out.println("please enter item quantity: ");
		int itemQuantity = sc.nextInt();
		System.out.println(itemNumber+", "+itemName+", "+itemQuantity*itemRate);
		sc.close();
		}

}
