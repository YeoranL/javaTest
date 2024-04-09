package chap3;

import java.util.Scanner;

/*
1. 프로젝트 이름: chap3
2. 메인프로그램 이름: Sum.java
3.1. 내용을 입력한다
 for문을 이용해서 1부터 100까지 합을 구한다
  sum sum+i
4. 실행
5. 콘솔창에 보여준다
*/

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    
	    for(int i=1; i<=100; i++) {
	    	//sum = sum + i;
	    	sum += i;
	    }
	    
	    System.out.println("합: "+ sum);

	}

}
