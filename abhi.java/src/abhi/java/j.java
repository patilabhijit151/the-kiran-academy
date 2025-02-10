package abhi.java;

import java.util.Scanner;

public class j {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int z=sc.nextInt();
		int n1=0,n2=1,n3=0;
		System.out.println(n1+" "+n2);
		for(int i=1;i<=5;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
