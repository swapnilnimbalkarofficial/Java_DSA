package patterns;

import java.util.Scanner;

public class Print1 {

	public void print1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void print2(int n) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void print3(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void print4(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public void print5(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {//j=1 j<=5-1+1 
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void print6(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {//j=1 j<=5-1+1 
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	
	public void print7(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i+1; j++) {//j=1 j<=5-1+1 
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public void print8(int n) {
		for(int i=0; i<n; i++) {
			//space
			for(int j=0; i<n-i-1; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			}
			//space 
			for(int j=0; i<n-i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public void print9(int n) {
		for(int i=0; i<n; i++) {
			//space
			for(int j=0; i<i; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=0; j<2*n-(2*i+1); j++) {
				System.out.print("*");
			}
			//space 
			for(int j=0; i<i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void print10(int n) {
		for(int i=n; i>=1; i--) {
			//space
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			//stars
			for(int j=i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		Print1 p1= new Print1();
		//p1.print1(n);
		//p1.print2(n);
		//p1.print3(n); 
		//p1.print4(n);
		//p1.print5(n);
		//p1.print6(n);
		//p1.print8(n);
		p1.print10(n);
	}

}
