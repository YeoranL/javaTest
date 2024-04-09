package chap3;

import java.util.Scanner;

/*
1. 프로젝트 이름: chap3
2. 메인프로그램 이름: ForTest.java
3. 내용을 입력한다
 for문을 이용해서 무한루프를 돈다
 반복문에서 입력값을 받는다
 입력값이 -1이 아니면 합계를 구한다(sum+=입력값)
 입력값이 -1이면 반복문을 종료
4. 실행
5. 콘솔창에 보여준다
*/

public class ForTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value, sum = 0;		
		
		for(;true;) { //무한루프
			System.out.print("값> ");
			value = sc.nextInt();
			if(value != -1) {
				sum += value;
			} else {
				break;
			}			
		}
		System.out.println("합계: " + sum);
	}

}
