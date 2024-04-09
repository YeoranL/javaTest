package chap3;

public class MathTest {

	public static void main(String[] args) {		
		
		//반복문 (초기값;조건문;증감치)
		//1부터100 (int)(Math.random()*(100-1+1)+1)
		//5099부터 6044 (int)(Math.random()*(6044-5099+1)+5099)
		for(int i=0; i<20; i++) {
			int value = (int)(Math.random()*(9000-7000+1)+7000);
			System.out.println(i+1+"번="+value);
		}
	}

}
