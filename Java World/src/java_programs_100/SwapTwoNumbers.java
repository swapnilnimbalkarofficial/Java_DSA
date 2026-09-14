package java_programs_100;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numebr 1 number 2: ");
		a=sc.nextInt();
		b=sc.nextInt();
	
		System.out.println("Beofore Swapping: "+"\na: "+a+"\nb: "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping: "+"\na: "+a+"\nb: "+b);
		
	}

}
