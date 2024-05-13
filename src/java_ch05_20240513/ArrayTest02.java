package java_ch05_20240513;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = new int[2][3];
		
		int[][] array1 = {
				{10,20,30},
				{40,50,60},
				{70,80,90}				
				};
		// arr1 배열의 모든 원소의 합을 구하시오.
		int[] arr1 = {10,20,30,40,60};
		int sum = 0;
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);
		
		// Python 스타일
		// for i in arr1:
		// 	sum = sum + i
		
		
		// 향상된 for 문
		for(int i : arr1)	{
			sum = sum + i;
		}
		System.out.print(sum);
	}
	

}
