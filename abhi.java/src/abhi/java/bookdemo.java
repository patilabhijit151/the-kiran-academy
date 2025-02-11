package abhi.java;

import java.util.Scanner;

class book{
	String book_name;
	int book_price;
	int book_quantity;
	String book_author;
	int book_pages;
	Double total;
	
}
public class bookdemo { 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		book b1 = new book();
		
		System.out.println("the name of book is:");
	    b1.book_name=sc.next();	 
	    
	    System.out.println("the price of book is:");
	    b1.book_price=sc.nextInt();
	    
	    System.out.println("quantity of book:");
	    b1.book_quantity=sc.nextInt();
	    
	    System.out.println("name of book outhor is:");
	    b1.book_author=sc.next();
	    
	    System.out.println("total pages in the books:");
	    b1.book_pages= sc.nextInt();
	    System.out.println("total price of books is:");
	    b1.total=(double) (b1.book_price*b1.book_quantity);
	    		System.out.println(b1.total);
	}

}
