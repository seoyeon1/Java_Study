package 페스티벌;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();

		System.out.println("잔돈: " + money + "원");
		if (money >= 10000) {
			System.out.println("10000원 : " + (money / 10000));
			money = money - 10000 * (money / 10000);
		} else
			System.out.println("10000원 : " + (money / 10000));

		if (money >= 5000) {
			System.out.println("5000원 : " + (money / 5000));
			money = money - 5000 * (money / 5000);
		} else
			System.out.println("5000원 : " + (money / 5000));

		if (money >= 1000) {
			System.out.println("1000원 : " + (money / 1000));
			money = money - 1000 * (money / 1000);
		} else
			System.out.println("1000원 : " + (money / 1000));

		if (money >= 500) {
			System.out.println("500원 : " + (money / 500));
			money = money - 500 * (money / 500);
		} else
			System.out.println("500원 : " + (money / 500));

		if (money >= 100) {
			System.out.println("100원 : " + (money / 100));
			money = money - 100 * (money / 100);
		} else
			System.out.println("100원 : " + (money / 100));

	}

}
