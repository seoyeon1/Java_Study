package �佺Ƽ��;

public class Ex06 {

	public static void main(String[] args) {
		int res = 0;//��� ����
		int start = 0;//���� ���� ���� ���ۺ���
		int mul = 0;//�� ������ ����
		for (int i = 77; i >= 1 ; i--) {//���� �� �����ϰ� �׸�ŭ ������Ű���� i�� ���.
			start = 78-i;
			mul = start * i;
			res += mul;//���� ����� ����&����
		}
		System.out.println(res);

	}

}
