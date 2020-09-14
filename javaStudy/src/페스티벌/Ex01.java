package 페스티벌;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게: ");
		int nowW = sc.nextInt();
		System.out.print("희망 몸무게: ");
		int hopeW = sc.nextInt();
		int week = 1;
		

//do-while
		
		do {
		System.out.print(week + "주차 감량 몸무게 : ");
		int loseW = sc.nextInt();
		nowW -= loseW;
		week++;
		
	}while(nowW>hopeW);
	System.out.println(nowW + "kg 달성!! 축하합니다!");

		
		
	}
}

//while

//		while(nowW>hopeW) {
//			System.out.print(week + "주차 감량 몸무게 : ");
//			int loseW = sc.nextInt();
//			nowW -= loseW;
//			week++;
//			
//
//		}
//		System.out.println(nowW + "kg 달성!! 축하합니다!");