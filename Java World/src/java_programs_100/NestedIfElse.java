package java_programs_100;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int obtainedMarks, passingMarks;
		char grade;
		passingMarks=35;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your obtained Marks");
		obtainedMarks=sc.nextInt();
		if(obtainedMarks>=passingMarks) {
			if(obtainedMarks>=90) {
				grade='A';
			}
			else if(obtainedMarks>=80) {
				grade='B';
			}
			else if(obtainedMarks>=70) {
				grade='C';
			}
			else if(obtainedMarks>=60) {
				grade='D';
			}
			else if(obtainedMarks>=50) {
				grade='E';
			}
			else if(obtainedMarks>=40) {
				grade='F';
			}
			else if(obtainedMarks>=35) {
				grade='G';
				System.out.println("");
			}else {
				System.out.println("Better Luck Next Time. \nYour are Fail.");
			}
		}else {
			System.out.println("sorry");
		}
	}

}
