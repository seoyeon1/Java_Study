package �佺Ƽ��;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;//�ݿø� ����� ������ ����
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		System.out.println();
		
		if(num%10>=5) {
			res = num + (10-num%10);
		}
		else
			res = num - (num%10);
		
		System.out.println("�ݿø� �� : "+ res);
	}

}
