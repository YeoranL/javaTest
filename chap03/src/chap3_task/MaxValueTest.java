package chap3_task;

public class MaxValueTest {

	public static void main(String[] args) {
		int[] arr = new int[] {23, 34, 12, 56};
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			} else {
				
			}
			
		}
		System.out.println(maxValue);
	}

}
