package chap3;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score = 0;
		
		System.out.print("점수>> ");
		score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("학점A");
		} else if(score>=80) {
			System.out.println("학점B");
		} else if(score>=70) {
			System.out.println("학점C");
		} else if(score>=60) {
			System.out.println("학점D");
		} else {
			System.out.println("학점F");
		}
	}

}
