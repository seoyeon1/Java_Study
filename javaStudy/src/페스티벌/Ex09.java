package �佺Ƽ��;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ִ� & �ּ� ����� ���ϱ�");
		System.out.print("����1 >> ");
		int num1 = sc.nextInt();
		System.out.print("����2 >> ");
		int num2 = sc.nextInt();
		
		int gcd=0;//�ִ�����
		int min = 0;//�ּҰ����
		int tmp = 1;
		int mulNum = num1*num2;

		//num1:ū�� num2:������ ����.
		
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//�������� 0�̵� ������ ���� ���� ū ���� ��� ����
		while(tmp > 0){//��Ŭ����(�ִ�����->num1(ū��)�� num2(������)�� ���� �������� 0�� �� �� ���� ����.)
	        tmp=num1%num2;
	        num1=num2;//���� num2�� ū ���� �ǰ�, tmp�� ���� ������ ����Ͽ� �ٽ� tmp�� 0�̵ɶ����� �ݺ�.
	        num2=tmp;
	      }
		gcd = num1;//���������� ���� ū ���� �ִ������� ��.
		
		//�ּҰ����=�μ��ǰ�/�ִ�����		
		min = mulNum / gcd;
		
		System.out.println("�ִ�����: " + gcd);
		System.out.println("�ּҰ����: "+ min);
		
	}

}
//��Ŭ���� ȣ����
//1. �� ���� �Է¹޴´�.
//
//2. �� ���� ū���� �������� �����Ѵ�.
//
//3. �� ���� ���� �������� 0�϶� ���� ū���� �������� ������.
//
//4.�������� 0�� �Ǵ� ���� ū���� �ִ������̴�.
//
//5.ó�� �Է¹��� �μ��� ���� �ִ������� ������ �ּҰ�������ȴ�.
