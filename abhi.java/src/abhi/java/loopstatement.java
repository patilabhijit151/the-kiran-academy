package abhi.java;

public class loopstatement {
	public static void main(String[] args) {
		
		//write a program to print 1 to 10
		for(int k=1;k<=10;k++) {
			System.out.println(k);
		}
		
		System.out.println();
		
		//write a program to print 11 to 22
		int a=11;
		while(a<=22) {
			System.out.println(a);
			a++;
		}
		System.out.println();
		
		
		//write a program to print 33 to 55
		int b=33;
		do {
			System.out.println(b);
			b++;
		}
		while(b<=55);
		
		//write a program to print 55 to 10
		for(int k=55;k>=10;k--) {
			System.out.println(k);
		}
		
		//write a program to print 43 to 22
		int n=43;
		while(n>=22) {
			System.out.println(n);
			n--;
		}
		
		//write a program to print 11 to 1
		int x=11;
		do {
			System.out.println(x);
			x--;
		}
		while(x>=1);
		
		//write a program to print odd number
		for(int d=33;d<=55;d+=2) {
			System.out.println("the odd number between 33 to 55 are:"+d);
		}
	}
}


