package �佺Ƽ��;

import java.util.Scanner;

//���μ�����
public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();
//		int divNum = 0;
		System.out.print(num + " = ");

		for (int j = 2; j < num; j++) {//2���� ���������ϴ� �� �������
			while (num % j == 0) {
				num = num / j;
				System.out.print(j + " * ");

			}

		}
		System.out.println(num);//�������� *�� �ȳ��������ϴϱ�num�� ���� ���!!!
//		}

	}

}
