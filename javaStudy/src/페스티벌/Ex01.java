package �佺Ƽ��;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������: ");
		int nowW = sc.nextInt();
		System.out.print("��� ������: ");
		int hopeW = sc.nextInt();
		int week = 1;
		

//do-while
		
		do {
		System.out.print(week + "���� ���� ������ : ");
		int loseW = sc.nextInt();
		nowW -= loseW;
		week++;
		
	}while(nowW>hopeW);
	System.out.println(nowW + "kg �޼�!! �����մϴ�!");

		
		
	}
}

//while

//		while(nowW>hopeW) {
//			System.out.print(week + "���� ���� ������ : ");
//			int loseW = sc.nextInt();
//			nowW -= loseW;
//			week++;
//			
//
//		}
//		System.out.println(nowW + "kg �޼�!! �����մϴ�!");