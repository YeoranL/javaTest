package chap3;

public class Test {

	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			for(int j=0; j<11-(2*i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				if(j==6) {
					System.out.print("");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}


		System.out.println("");

		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<1+(2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
