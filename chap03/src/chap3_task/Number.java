package chap3_task;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0;

		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
		String[] num2 = new String[] {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"}; 
		
		System.out.print("정수를 입력하세요: ");
		number = sc.nextInt();
		
		if(number == num[number-1]) {
			System.out.println(num2[number-1]);
		}
		
	}

}
