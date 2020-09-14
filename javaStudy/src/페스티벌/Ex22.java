package 페스티벌;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 수 입력 : ");
			num[i] = sc.nextInt();
		}
		
		// 선택 정렬
	
		for (int j = 0; j < num.length-1; j++) {
			int min = j;
			for (int k = j+1; k < num.length; k++) {//가장작은 값을 가진 index를 찾아 min으로 넣어줌
				if (num[min] > num[k]) {
					min = k;
				}
			}//첫번째 값이랑 min에있는 값이랑 교환.
			int temp=0;
			temp = num[j];
			num[j]=num[min];
			num[min] = temp;
				
		}


		System.out.println("정렬 후");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
