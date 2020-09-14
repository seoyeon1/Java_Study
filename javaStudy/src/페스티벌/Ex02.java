package 페스티벌;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간?(시간) : ");

		int workHour = sc.nextInt();
		int pay = 0;

		if (workHour > 8) {
			pay = 5000 * 8 + (int)(5000 * 1.5 * (workHour - 8));
			//초과수당 계산, 1.5 때문에 double이되니까 (int)로 강제형변환해주기!!
		} else {
			pay = 5000 * workHour;
		}

		System.out.println("총 임금 : "+pay);
	}
}
