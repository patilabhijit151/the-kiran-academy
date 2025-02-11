package abhi.java;
import java.util.Scanner;
public class homework_10_02_2025 {
		public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
			 int number = sc.nextInt();
			 System.out.println("enter the number");
			 
			 int roundednumber= number - (number%5);
			 System.out.println("nearest multiple of 5: "+roundednumber);
		}

	}


