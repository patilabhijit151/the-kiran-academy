package abhi.java;

import java.util.Scanner;

public class i {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int i = 1;
		int count = 0;
		while (i <= y) {
			if (y % i == 0) {
				count++;
			}
			i++;

		}
		if(count==2) {
			System.out.println("the no. is prime");
		}
		else {
			System.out.println("no is not prime");
		}

	}

}
