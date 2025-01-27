package javaPractice2025;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the Circle: ");
		double radius=sc.nextDouble();
		System.out.println("Area of the given circle  is : "+3.14*radius*radius);
		sc.close();
	}

}
