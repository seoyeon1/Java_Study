package �佺Ƽ��;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ�0�� ������ ���� �Է�>> ");
		String num = sc.next();//�Է��� ���ڸ� string�� ����.
		System.out.println("���(-)�� �� �� >> " + sevenSeg(num));
	}
	
//		int zero = 6;
//		int one = 2;
//		int two = 5;
//		int three = 5;
//		int four = 4;
//		int five = 5;
//		int six = 6;
//		int seven = 3;
//		int eight = 7;
//		int nine = 5;

	public static int sevenSeg(String num) {
		int[] seg = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };//�� �ε���= 0-9������ ���ڸ� �ǹ�.
		String[] divStr = num.split("");//���ڿ��� ���� ���ڸ� split���� ������ ���ڿ� �迭�� ����
		int sum = 0;
		int i = 0;//�迭�� �����ϱ����� ����ϴ� �ε���

		while (i < divStr.length) {//�Է��� ���ڵ��� ���ø� ���ϱ� ����

			for (int j = 0; j < seg.length; j++) {
				if (Integer.parseInt(divStr[i]) == j) {//string("12") to int(12). �Է��� ���ڰ� 0-9�߿� �ִ��� ã��
					sum = sum + seg[j];//���ش� ���ڿ� ���Ǵ� ���ü��� sum�� ����.
				}
			}
			i++;//�Է��� ���ڵ� ��  �ϳ��� ���� ���� �������� ���� ���ڷ� �Ѿ
		}

		return sum;
	}

}
