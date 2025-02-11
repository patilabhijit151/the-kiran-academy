package home_work_11_02_2025;

import java.util.Scanner;

public class number_series3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int term=1;
		int diff=4;
		System.out.print(term);
		
		for(int i=1;i<number;i++) {
			term+=diff;
			System.out.print(", "+term);
			if(i==1) {
				diff+=1;
			}
			else {
				diff+=2;
			}
		}
	}

}
