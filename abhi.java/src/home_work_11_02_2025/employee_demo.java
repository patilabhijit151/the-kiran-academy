package home_work_11_02_2025;

import java.util.Scanner;

public class employee_demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		employee emp1= new employee();
		System.out.println("the name of employee is :");
		emp1.name= sc.next();
		
		System.out.println("the post of employee is:");
		emp1.post=sc.next();
		
		System.out.println("the salary of employee is: ");
		emp1.salary=sc.nextDouble(); 
	}

}
