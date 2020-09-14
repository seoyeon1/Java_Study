package 페스티벌;

import java.util.Arrays;

public class Ex16 {

	public static void main(String[] args) {

		System.out.println(reverseStr("ZAbcdVefEg"));

	}

	
	public static String reverseStr(String string) {
		char[] str = string.toCharArray();//문자열에서 한글자씩 char형 배열에 저장
		
		Arrays.sort(str);
		String con = String.valueOf(str);
		//char배열, 객체, int, double같은 타입의 값을 string으로 변환.
		return con;
	}

}

//		String[] str = string.split("");//string배열에 한 글자씩 저장