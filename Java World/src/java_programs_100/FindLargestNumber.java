package java_programs_100;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x,y,z");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y&&x>z) {
			System.out.println("x is Greater.");
		}
		else if(y>x&&y>z) {
			System.out.println("y is Greater.");
		}
		else if(z>x&&z>y) {
			System.out.println("z is Greater.");
		}
		else {
			System.out.println("Invalid");
		}

	}

}
