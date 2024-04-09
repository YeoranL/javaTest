package chap3_task;

public class ThreeFour {

	public static void main(String[] args) {
		int[] number = new int[100];
		int sum = 0;
		
		for(int i=0; i<number.length; i++) {
			number[i] = i+1;
					
			if(number[i]%3 == 0 || number[i]%4 == 0) {
				sum += number[i];
			}
		}
		System.out.println("3 또는 4의 배수의 합=" + sum);
	}

}
