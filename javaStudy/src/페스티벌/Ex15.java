package �佺Ƽ��;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է�: ");
		int n = sc.nextInt();
		int j = 1;//����
		for(int i = 0;i<n;i++) {
			j = j+ i;//����(n-1)���� ����� n�� ���ϸ鼭 j�� ����&���
			System.out.print(j + " ");
		}
	}

}
