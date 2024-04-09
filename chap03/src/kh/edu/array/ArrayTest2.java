package kh.edu.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[][] array = new int[][] {{0,0,0,1,1,0,0,0,0,0},
									 {0,0,1,1,0,0,0,0,0,0},
									 {0,0,0,0,0,0,1,1,1,0}};
									 
		int count = 0;							 
									 
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
				if(array[i][j] == 0) {					
					count++;
				}
				
			}	
			
			System.out.println();
						
		}
		
		System.out.println("빈좌석의 수는 " + count + "입니다.");
				
	}

}
