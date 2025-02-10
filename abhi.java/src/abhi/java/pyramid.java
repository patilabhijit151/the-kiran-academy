package abhi.java;

public class pyramid {
	public static void main(String[] args) {
		int sp=5;
		char ch1 ='a';
		for(int i=1;i<=5;i++) {
			ch1='a';
			for(int k=1;k<=(sp-i);k++) {
				System.out.print(" ");
			} 
				for(int j=1;j<=i;j++){
					System.out.print((ch1++)+" ");
				}
				System.out.println();
			
		}
		
	}

}
