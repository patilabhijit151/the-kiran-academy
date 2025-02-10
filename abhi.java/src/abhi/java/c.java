package abhi.java;

public class c {
	public static void main(String[] args) {
		int sum=0;
		int i=97;
		do {
			if(i%7==0 && i%3==0) {
				sum=sum+i;
			}
			i--;
		}while(i>=33);
		System.out.println(sum);
		
	}

}
