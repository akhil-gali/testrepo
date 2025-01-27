package javaPractice2025;

import java.util.Scanner;

public class ArraySum {

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
		int sum=0;
		for(int x: tempArray) {
			sum= sum+x;
		}
		System.out.println("Total sum : " +sum);

	}

}
