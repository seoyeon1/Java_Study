package �佺Ƽ��;
//�ϻ�� ��
import java.util.Scanner;

public class Bonus03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isHarshad(10));

	}

	public static boolean isHarshad(int num) {
		
		int Hsum=0;
		int start = num;
		//�������� ���� ����� ���ؾ��ϴ� ���� ������ ��Ƶΰ� ���� �� ���� ��������!!
		while(start>0) {
			Hsum += start%10;
			start = start/10;//�پ��� �ڸ��� �����ǰ� while ���
		}
		if(num%Hsum == 0) {
			return true;			
		}
		else {			
			return false;
		}
	}

}

//num = 1213;
//int length = (int)(Math.log10(num)+1); //4