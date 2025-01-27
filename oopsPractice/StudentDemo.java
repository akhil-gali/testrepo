package oopsPractice;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNum;
		String studName;
		double mark1;
		double mark2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rollnumber:");
		rollNum=sc.nextInt();
		System.out.println("Enter the Student name:");
		studName=sc.next();
		System.out.println("Enter marks 1: ");
		mark1= sc.nextDouble();
		System.out.println("Enter marks 2: ");
		mark2=sc.nextDouble();
		Student student= new Student();
		student.setStudDetails(rollNum, studName, mark1, mark2);
		student.calculateTotal();
		student.displayStudDetails();
		sc.close();

	}

}
