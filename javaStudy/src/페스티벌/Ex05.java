package 페스티벌;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수: ");
		int rows = sc.nextInt();
		
		for (int i = 1; i <= rows; i++) {//행 결정. 행 개수만큼 반복
			for (int j = 1; j <= i; j++) {
				//한 행에 찍힐 별의 개수 결정. i행이면 i개 * 필요.->i만큼반복 
				System.out.print("*");
			}
			System.out.println();//다음줄 넘어가기
			
		}

	}

}
