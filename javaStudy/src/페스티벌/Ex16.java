package �佺Ƽ��;

import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	
	public static String reverseStr(String string) {
		char[] str = string.toCharArray();//���ڿ����� �ѱ��ھ� char�� �迭�� ����
		
		Arrays.sort(str);
		String con = String.valueOf(str);
		//char�迭, ��ü, int, double���� Ÿ���� ���� string���� ��ȯ.
		return con;
	}

}

//		String[] str = string.split("");//string�迭�� �� ���ھ� ����