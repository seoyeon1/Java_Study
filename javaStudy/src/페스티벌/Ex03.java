package Æä½ºÆ¼¹ú;

public class Ex03 {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
				sum += i;
		}
			else {
				System.out.print(-1*i+" ");
				sum += -1*i;
			}
		}
		System.out.println();
		System.out.println("ÃÑÇÕ : "+sum);

	}

}
