package �佺Ƽ��;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ����: ");
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) {//�� ����. �� ������ŭ �ݺ�
			for (int j = 1; j <= i; j++) {
				//�� �࿡ ���� ���� ���� ����. i���̸� i�� * �ʿ�.->i��ŭ�ݺ� 
				System.out.print("*");
			}
			System.out.println();//������ �Ѿ��
			
		}

	}

}
