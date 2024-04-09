package chap3_task;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int[] score = new int[100];		
		int sum = 0;
		int count = 0;
		
		for(int i=0; i<score.length; i++) {
			
			System.out.print("성적을 입력하세요: ");
			score[i] = sc.nextInt();
			
			if(score[i] == -1) break;
			
			sum += score[i];
			
			count++;

		}
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum/count);
	}

}
