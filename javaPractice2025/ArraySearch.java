package javaPractice2025;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tempArray = {1,2,3,4,5};
		System.out.println("enter the value thet you want to check: ");
		Scanner sc= new Scanner(System.in);
		int key= sc.nextInt();
		boolean b= false;
		for(int x: tempArray) {
			if(x==key) {
				b=true;
				break;
			}
		}
		if(b) System.out.println("found");
		else System.out.println("not found");
	}

}
