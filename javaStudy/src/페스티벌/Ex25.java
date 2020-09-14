package 페스티벌;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리0을 제외한 숫자 입력>> ");
		String num = sc.next();//입력한 숫자를 string을 받음.
		System.out.println("대시(-)의 총 합 >> " + sevenSeg(num));
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
		int[] seg = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };//각 인덱스= 0-9까지의 숫자를 의미.
		String[] divStr = num.split("");//문자열로 받은 숫자를 split으로 나눠서 문자열 배열에 저장
		int sum = 0;
		int i = 0;//배열에 접근하기위해 사용하는 인덱스

		while (i < divStr.length) {//입력한 숫자들의 데시를 합하기 위해

			for (int j = 0; j < seg.length; j++) {
				if (Integer.parseInt(divStr[i]) == j) {//string("12") to int(12). 입력한 숫자가 0-9중에 있는지 찾고
					sum = sum + seg[j];//그해당 숫자에 사용되는 데시수를 sum에 저장.
				}
			}
			i++;//입력한 숫자들 중  하나의 데시 수를 더했으니 다음 숫자로 넘어감
		}

		return sum;
	}

}
