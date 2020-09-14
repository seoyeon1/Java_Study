package 페스티벌;

import java.util.Random;

public class Ex14 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=r.nextInt(45)+1;
			for (int j = 0; j < i; j++) {// 반복횟수 주의!!!!!
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
					
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("행운의 숫자 : "+lotto[i]);
		}

	}

}
