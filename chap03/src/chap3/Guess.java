package chap3;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, count=0, num2=0;
		
		num2 = (int)(Math.random()*(10-1+1)+1);
		System.out.println(num2);
		
		for(;;) {			
			
			System.out.print("정답을 추측하여 보시오: ");
			num = sc.nextInt();
			
			count++;
			
			 if(num2 == num) {
				 System.out.println("축하합니다. 시도횟수="+count);
				 break;
			 } else {
				 String result = (num > num2 ? "제시한 정수가 높습니다" : "제시한 정수가 낮습니다");
				 System.out.println(result);
				 
			 }
		}
		  
		
	}

}
