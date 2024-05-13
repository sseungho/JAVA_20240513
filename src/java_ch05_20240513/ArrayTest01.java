package java_ch05_20240513;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열은 data type이 모두 동일
		
		int[] arrayInt = {1,2,14,51,6};
		double[] arrayDou = {1.4,2.34,1.04,5.1,0.6};
		String[] arrayStr = {"Kim", "Rancid", "RHCP"};
		
		int[] arrayTest1 = null; // 참조하는 배열값이 없는 배열 이름만 선언
		// list1 = []
					
		int[] arrayTest2 = new int[5]; // 각 원소 값이 0으로 초기화되는 5칸짜리 배열이 생성
		
		for(int i=0; i<arrayTest2.length; i++) {
			// 배열이름.length >> 배열 길이 계산
			System.out.println(arrayTest2[i]);	
		}
		
		System.out.println("---------------");	
				
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + arrayInt[i];
			System.out.println(arrayInt[i]);	
		}
		System.out.println("---------------");	
		System.out.print(sum);
		
		
	}

}
