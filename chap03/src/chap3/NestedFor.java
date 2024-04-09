package chap3;

public class NestedFor {

	public static void main(String[] args) {
/*		
		for(int i=0; i<5; i++) {
			for(int j=0; j<10; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<5-i; k++) {
				System.out.print("★");
			}
			System.out.println();
		}

		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("★");
			}
			System.out.println();
		}

	
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<i+1; j++) {
					System.out.print("★");
				}
			} else {
				for(int j=0; j<9-i; j++) {
					System.out.print("★");
				}
			}
			System.out.println();
		}

		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<4-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<2*i+1; j++) {
					System.out.print("★");
				}
				
			} else {
				for(int j=0; j<i-4; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<9-(2*(i-4)); j++) {
					System.out.print("★");
				}
			}
			
			System.out.println();		
		
		}
*/		
		
		for(int i=0; i<13; i++) {
			if(i<7) {
				for(int j=0; j<i+1; j++) {
					System.out.print("★");
				}
				for(int j=0; j<12-(2*i); j++) {
					System.out.print(" ");
				}
				for(int j=0; j<i+1; j++) {
					System.out.print("★");
				}
				
			} else {
				for(int j=0; j<13-i; j++) {
					System.out.print("★");
				}
				for(int j=0; j<(2*i)-12; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<13-i; j++) {
					System.out.print("★");
				}
			}
			
			System.out.println();		
		}
	}

}
