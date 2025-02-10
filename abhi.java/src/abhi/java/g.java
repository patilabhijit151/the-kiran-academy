package abhi.java;

public class g {
	public static void main(String[] args) {
		int product=1;
		int i=12;
		do {
			if(i%13==0 && i%2==0) {
				product=product*i;
				
			}
			i++;
		}while(i<=79);
		System.out.println(product);
	}

}
