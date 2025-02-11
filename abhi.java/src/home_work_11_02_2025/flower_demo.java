package home_work_11_02_2025;

import java.util.Scanner;



public class flower_demo {
	public static void main(String[] args) {
		Scanner demo= new Scanner(System.in);
		flower flw1=new flower();
		System.out.println("the name of flower is: ");
		flw1.name=demo.next();
		
		System.out.println("colour of flower is: ");
		flw1.colour=demo.next();
		
		System.out.println("the smell of flower is: ");
		flw1.smell=demo.next();
	}

}
