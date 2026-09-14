package java_programs_100;

import java.util.Scanner;

public class SwapToNumbersWithoutUsingThirdVar {

	public static void main(String[] args) {
		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before Swapping: "+"\na: "+a+"\nb: "+b);
		a=a+b;//a=100+200 a=300
		b=a-b;//b=300-200 b=100
		a=a-b;//a=300-100 a=200
		System.out.println("After Swapping: "+"\na: "+a+"\nb: "+b);
	}

}
