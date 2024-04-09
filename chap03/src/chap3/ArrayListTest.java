package chap3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArray = new String[5];
		ArrayList<String> strList = new ArrayList<String>();
				
		for(int i=0; i<strArray.length; i++) {
			System.out.print("이름입력요망>> ");
			strArray[i] = sc.nextLine();
		}
		
		for(String data: strArray) {
			System.out.println(data);
		}
		
		System.out.println("END");
	}

}
