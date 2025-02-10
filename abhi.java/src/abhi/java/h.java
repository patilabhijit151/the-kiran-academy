package abhi.java;

public class h {
	public static void main(String[] args) {
		int product=1;
		int i=10;
		do {
			if(i%11==0 && i%4==0) {
				int j=i*i;
				product=product*j;
			}
			i++;
		}while(i<=90);
		System.out.println(product);
		
	}

}
