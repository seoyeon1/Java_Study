package 페스티벌;

import java.util.Random;

public class Ex29 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("배열에 있는 값");
		int[][] arr = new int[8][8];
		
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[0].length; i++) {
				arr[j][i] = r.nextInt(99)+1; 
				System.out.print(arr[j][i]+ "\t");
			}
			System.out.println();
		}//렌덤 배열 출력

		int max = arr[0][0];
		int maxRow = 0;
		int maxCol = 0;
		
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr[0].length; i++) {
				if(arr[j][i] > max) {
					max = arr[j][i];
					maxRow = j+1;
					maxCol = i+1;
				}

	}
		}
			System.out.println("최대값 >> "+max);
			System.out.println("행>> "+maxRow+" 열>> "+maxCol);
	}
}
