package 페스티벌;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[][] array = new int[num][num];
		int cnt = 1;
		int start = 0;
		int end = array.length - 1; // for문의 시작과 끝
		int temp = 0;
		int reverse = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = start; j != end + reverse; j += reverse) {//reverse기억아자!!!
				array[i][j] = cnt++;
			}
			temp = start;
			start = end;
			end = temp;

			reverse *= -1;//한 행을 지나면 꼭 해줘야하는 걸 기억하자!!!
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
