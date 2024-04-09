package chap3;

import java.util.Scanner;

/*
1. 프로젝트 이름: chap3
2. 메인프로그램 이름: Divisor.java
3.1. 내용을 입력한다
 양의 정수를 입력받는다
  for문을 이용해서 1부터 양의 정수까지 돌린다
   약수를 구한다 (양의정수%i)==0 약수다
4. 실행
5. 콘솔창에 보여준다
*/

public class Divisor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("양의 정수>> ");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+"\t");
			} 			 
		}		
		System.out.println("The end");		
	}

}
