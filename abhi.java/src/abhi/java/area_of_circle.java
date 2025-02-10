package abhi.java;

import java.util.Scanner;

public class area_of_circle {
	public static void main(String[] args) {
		System.out.println("calculating area of circle:");
		double radius;
		System.out.println("enter the radius of circle:");
		Scanner sc= new Scanner(System.in);
		radius= sc.nextDouble();
		double area= 3.14*radius*radius;
		System.out.println("area of circle is:"+area);
		
	}

}
