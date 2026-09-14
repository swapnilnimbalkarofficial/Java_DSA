package java_programs_100;

import java.util.Scanner;

public class ConvertFahrenheihtToCel {

	public static void main(String[] args) {
		float temperature;
		System.out.println("Enter a Temperature");
		Scanner sc=new Scanner(System.in);
		temperature=sc.nextFloat();
		temperature=(temperature-32)*5/9;
		System.out.println("Temperature in celsius: "+temperature);
	}

}
