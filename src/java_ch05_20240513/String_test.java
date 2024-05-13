package java_ch05_20240513;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "제임스";
		String str2 = "제임스";
		
		if (str1 == str2) { // 문자열이 저장된 100 번지(참조)를 비교 100 == 100
			System.out.println("참!!!");
		} else {
			System.out.println("거짓!!");
		}
		
		String strObject1 = new String("커트");
		String strObject2 = new String("커트");
		
		// strObject1 이 저장된 번지가 200 이고, strObject2가 저장된 번지가 300 이라면 
		// 200 == 300 은 거짓이므로 false!
		if (strObject1 == strObject2) {
			System.out.println("참!!!");
		} else {
			System.out.println("거짓!!");
		}
		
		// 실제 문자열 값이 같은지 비교 >> true!
		if (strObject1.equals(strObject2)) {
			System.out.println("참!!!");
		} else {
			System.out.println("거짓!!");
		}
	}

}
