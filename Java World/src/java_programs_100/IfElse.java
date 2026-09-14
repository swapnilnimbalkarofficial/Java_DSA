package java_programs_100;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int obtainedMarks;
		int passingMarks=35;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks: ");
		obtainedMarks=sc.nextInt();
		
		if(obtainedMarks>=passingMarks) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}

	}

}
