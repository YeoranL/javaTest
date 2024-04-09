package chap3;

import java.util.Scanner;

public class InputAvr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum=0, count = 0;
		
		for(;true;) {
			System.out.print("점수: ");
			int score = sc.nextInt();
			
			if(score < 0) break;
			
			sum += score;
			count++;
			
		}
		
		System.out.println("합계는: " + (double)sum/count);
	
	}
}
