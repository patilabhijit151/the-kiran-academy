package home_work_11_02_2025;

import java.util.Scanner;

public class number_series2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		for(int i=1;i<=number;i++){
			System.out.println((i*i*i)+" ");
		}
	}

}
