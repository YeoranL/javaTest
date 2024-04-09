package chap3;

import java.util.Scanner;

public class SwithchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = 0;
		
		System.out.print("점수>> ");
		score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9: 
			System.out.println("학점A"); 
			break;
		case 8: 
			System.out.println("학점B"); 
			break;
		case 7: 
			System.out.println("학점C"); 
			break;
		case 6: 
			System.out.println("학점D"); 
			break;
		default: 
			System.out.println("학점F"); 
			break;
		}
	}

}
