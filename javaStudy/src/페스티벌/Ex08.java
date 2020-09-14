package 페스티벌;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = 0;//반올림 결과를 보여줄 변수
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println();
		
		if(num%10>=5) {
			res = num + (10-num%10);
		}
		else
			res = num - (num%10);
		
		System.out.println("반올림 수 : "+ res);
	}

}
