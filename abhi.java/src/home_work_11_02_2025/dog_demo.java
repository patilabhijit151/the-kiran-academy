package home_work_11_02_2025;

import java.util.Scanner;

public class dog_demo {
	public static void main(String[] args) {
		Scanner demo= new Scanner(System.in);
		dog dg1= new dog();
		System.out.println("the name of dog is: ");
		dg1.name= demo.next();
		
		System.out.println("the colour of dog is: ");
		dg1.colour= demo.next();
		
		System.out.println("the breed of dog is: ");
		dg1.breed= demo.next();
		
		System.out.println("the age of dog is: ");
		dg1.age= demo.nextInt();
		
		System.out.println("the sound of dog is: ");
		dg1.sound= demo.next();
	}
}
