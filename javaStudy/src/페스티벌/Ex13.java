package �佺Ƽ��;

public class Ex13 {
	public static void main(String[] args) {
		int input =8;
		for (int i = 1; i<=input;i++) {
			System.out.print(fibo(i) + " ");//����+���ڿ�=���ڿ��� ���� Ȱ���� ���.
		}
	}

	public static int fibo(int i) {
		if (i <= 1)
			return i;
		
		else
			return fibo(i-2) + fibo(i-1);

	}

//�ݺ�

//	public static int fibo(int in) {
//		for(int i =2; i<in; i++) {
//			fibo(i) = fibo(i-2)+fibo(i-1);
//		}
//		return fibo(n-2)+fibo(n-1);
//	}
	
	
	

}