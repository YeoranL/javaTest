package chap3;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		number = sc.nextInt();
		
		//System.out.println(number%2==0?"짝수입니다":"홀수입니다");
		
		if(number%2==0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
