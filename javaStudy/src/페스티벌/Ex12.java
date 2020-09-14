package 페스티벌;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[][] array = new int[num][num];
		int cnt = 1;
		int start = 0;
		int end = array.length - 1; // for문의 시작과 끝


		for (int i = 0; i < array.length; i++) {
			for (int j = start; j<array.length; j++) {
				array[j][i] = cnt++;
			}

		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
