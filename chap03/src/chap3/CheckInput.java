package chap3;

import java.util.Scanner;

public class CheckInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		
//		do {
//			System.out.print("월입력[1~12]: ");
//			month = sc.nextInt();
//		} while (month<1 || month>12);
//		System.out.println("입력한 월: " + month + "월");
		
		for(;true;) {
			System.out.print("월입력[1~12]: ");
			month = sc.nextInt();
			if(month<1 || month>12) {
				System.out.println("♡ 1~12 입력요망 ♡");
				continue;
			} else {
				System.out.println("입력한 월: " + month + "월");
				break;
			}
		}

	}

}
