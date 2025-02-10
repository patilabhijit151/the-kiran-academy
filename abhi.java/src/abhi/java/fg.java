package abhi.java;

public class fg {
	public static void main(String[] args) {
		int sp=5;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=(sp-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
