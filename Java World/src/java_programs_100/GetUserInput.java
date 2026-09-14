package java_programs_100;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		System.out.println("Enter Integer");
		int num=sc.nextInt();
		System.out.println("Enter float");
		float f=sc.nextFloat();
		System.out.println("Enter a double");
		double d= sc.nextDouble();
		System.out.println("Enter a char");
		String c= sc.next();
		System.out.println("Enter a long");
		long l=sc.nextLong();
		
		System.out.println("String: "+str);
		System.out.println("Intger: "+num);
		System.out.println("Float: "+f);
		System.out.println("Double: "+d);
		System.out.println("Character: "+c);
		System.out.println("Long: "+l);
	}

}
