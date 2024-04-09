package chap3;

import java.util.Scanner;

/*
1. 프로젝트 이름: chap3
2. 메인프로그램 이름: StringSwitch.java
3.1. 내용을 입력한다
3.2. switch case 문을 이용한다
 해당되는 피자를 찾아서 가격을 정한다
 case문: 콤비네이션 20000, 슈퍼스프림 20000, 포테이토 15000, 쉬림프 25000
3.3. 그 해당된 피자명과 가격을 출력한다
4. 저장
5. 콘솔창에 보여준다
*/
public class StringSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pizza = null;
		int price = 0;
		
		System.out.print("피자 종류: ");
		pizza = sc.nextLine();
		
		switch (pizza) {
		case "콤비네이션":
		case "슈퍼스프림":
			price = 20000;
			break;
		case "포테이토":
			price = 15000;
			break;
		case "쉬림프":
			price = 25000;
			break;
		default:
			price = 0;
			break;
		}
		
		System.out.println(pizza + "의 가격: " + price);

	}

}
