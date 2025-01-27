package oopsPractice;

public class Student {
	int rollNum;
	String studName;
	double mark1;
	double mark2;
	double totalMarks;
	void setStudDetails(int rollNum, String studName,double mark1,double mark2) {
		this.rollNum= rollNum;
		this.studName= studName;
		this.mark1=mark1;
		this.mark2=mark2;
	}
	void calculateTotal() {
		totalMarks=mark1+mark2;
	}
	void displayStudDetails()
{System.out.println("Roll number : "+rollNum);
System.out.println("Student Name : "+studName);
System.out.println("Total Marks : "+totalMarks);
		}
}
