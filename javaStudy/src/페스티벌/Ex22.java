package �佺Ƽ��;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "��° �� �Է� : ");
			num[i] = sc.nextInt();
		}
		
		// ���� ����
	
		for (int j = 0; j < num.length-1; j++) {
			int min = j;
			for (int k = j+1; k < num.length; k++) {//�������� ���� ���� index�� ã�� min���� �־���
				if (num[min] > num[k]) {
					min = k;
				}
			}//ù��° ���̶� min���ִ� ���̶� ��ȯ.
			int temp=0;
			temp = num[j];
			num[j]=num[min];
			num[min] = temp;
				
		}


		System.out.println("���� ��");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
