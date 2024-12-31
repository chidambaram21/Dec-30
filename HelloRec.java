package edu.stpeters;

public class HelloRec {

	public static void main(String[] args) {
		
		
		int n = 9;
			
		printNumbers(n);
	}
	
		//123456789
		//12345678
		//1234567
		//123456
		//12345
		//1234
		//123
		//12
		//1
		//

	private static void printNumbers(int n) {

		
		if (n >0){
			for(int i= 1; i<=n;i++) {
				System.out.print(i);
			}
			System.out.println();
				printNumbers(n-1);
	}
	
	}

}
