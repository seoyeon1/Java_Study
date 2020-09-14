package 페스티벌;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력: ");
		int n = sc.nextInt();
		int j = 1;//초항
		for(int i = 0;i<n;i++) {
			j = j+ i;//이전(n-1)항의 결과와 n을 더하면서 j값 갱신&출력
			System.out.print(j + " ");
		}
	}

}
