package �佺Ƽ��;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð�?(�ð�) : ");

		int workHour = sc.nextInt();
		int pay = 0;

		if (workHour > 8) {
			pay = 5000 * 8 + (int)(5000 * 1.5 * (workHour - 8));
			//�ʰ����� ���, 1.5 ������ double�̵Ǵϱ� (int)�� ��������ȯ���ֱ�!!
		} else {
			pay = 5000 * workHour;
		}

		System.out.println("�� �ӱ� : "+pay);
	}
}
