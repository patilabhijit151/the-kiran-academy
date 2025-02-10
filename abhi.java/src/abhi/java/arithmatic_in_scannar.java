package abhi.java;

import java.util.Scanner;

public class arithmatic_in_scannar {
public static void main(String[] args) {
	int a,b;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter number");

	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a->"+a);
	System.out.println("b->"+b);
	int c=a+b;
	System.out.println("sum of a and b is:"+c);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a->"+a);
	System.out.println("b->"+b);
	int c=a-b;
	System.out.println("final result is :"+c);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a->"+a);
	System.out.println("b->"+b);
	int c=a*b;
	System.out.println("final result is :"+c);
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a->"+a);
	System.out.println("b->"+b);
	int c=a/b;
	System.out.println("final result is :"+c);
	
	
	
}
}
