package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		//변수5개 선언
		int[] num = new int[5];
		int sum=0;
		//계산
		for(int i=0; i<5; i++) {
			num[i] = (int)(Math.random()*(100-1+1)+1);
//			sum += num[i];
		}		
		
		for(int data/*향*/:num/*상*/) {
			System.out.println(data);
			sum += data;
		}
		
		//출력
//		for(int i=0; i<5; i++) {
//			if(i != 4) {
//				System.out.print(num[i] + "+");				
//			} else {
//				System.out.print(num[i] + "=" + sum);
//				break;
//			}
//		}
	}
}
