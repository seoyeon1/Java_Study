package �佺Ƽ��;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {

		Random r = new Random();
		byte[] randBytes = new byte[8];
		r.nextBytes(randBytes);
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (byte b : randBytes) {//�迭�� �ִ� ��Ұ��� ó��~������ �ϳ��ϳ� �����ͼ� b�� �־� ���
		    System.out.print(b + " ");
		}
		int max = randBytes[0];
		int min = randBytes[0];

		for (int i = 0; i < randBytes.length; i++) {
			if(min>randBytes[i])
				min = randBytes[i];
			else if(max<randBytes[i])
				max = randBytes[i];
		}
		System.out.println();
		System.out.println("���� ū �� : "+max);
		System.out.println("���� ���� �� : "+min);

	}

}
