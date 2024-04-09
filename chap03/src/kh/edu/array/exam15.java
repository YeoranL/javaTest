package kh.edu.array;

public class exam15 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][5];
		//int count = 0;
		
		for(int i=0; i<5; i++) {
			int x = (int)(Math.random()*3);
			int y = (int)(Math.random()*5);
			
			if(a[x][y] == 1) {
				i--;
				continue;
			}
			a[x][y] = 1;
			
		}
		
		/*while(!(count == 5)) {
			int x = (int)(Math.random()*3);
			int y = (int)(Math.random()*5);
			if(a[x][y] == 0) { //중복처리
				a[x][y]++; //값 1주기
				count++;			
			}
		}*/
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}

	} 

}
