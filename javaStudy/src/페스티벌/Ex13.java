package 페스티벌;

public class Ex13 {
	public static void main(String[] args) {
		int input =8;
		for (int i = 1; i<=input;i++) {
			System.out.print(fibo(i) + " ");//숫자+문자열=문자열인 것을 활요해 출력.
		}
	}

	public static int fibo(int i) {
		if (i <= 1)
			return i;
		
		else
			return fibo(i-2) + fibo(i-1);

	}

//반복

//	public static int fibo(int in) {
//		for(int i =2; i<in; i++) {
//			fibo(i) = fibo(i-2)+fibo(i-1);
//		}
//		return fibo(n-2)+fibo(n-1);
//	}
	
	
	

}