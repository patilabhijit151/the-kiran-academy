package home_work_11_02_2025;

import java.util.Scanner;

public class phone_demo {
	public static void main(String[] args) {
		Scanner demo= new Scanner(System.in);
		phone ph1= new phone();
		
		System.out.println("the name of phone is: ");
		ph1.name=demo.next();
		
		System.out.println("the colour of phone is: ");
		ph1.colour=demo.next();
		
		System.out.println("the price of phone is: ");
		ph1.price=demo.nextDouble();
		
		System.out.println("the os of phone is: ");
		ph1.os=demo.next();
		
	}

}
