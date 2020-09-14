package 페스티벌;

import java.util.Scanner;

//소인수분해
public class Ex19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
//		int divNum = 0;
		System.out.print(num + " = ");

		for (int j = 2; j < num; j++) {//2부터 나눠봐야하는 걸 기억하자
			while (num % j == 0) {
				num = num / j;
				System.out.print(j + " * ");

			}

		}
		System.out.println(num);//마지막에 *를 안내보내야하니까num은 따로 출력!!!
//		}

	}

}
