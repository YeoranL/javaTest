package chap3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> strList = new ArrayList<String>();
				
		for(;;) {
			System.out.print("이름입력요망(exit)>> ");
			String name = sc.nextLine();	
			
			if(name.equals("exit") == true) {
				break;
			} else {
				strList.add(name);
			}
		}
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		
		System.out.println("END");
	}

}
