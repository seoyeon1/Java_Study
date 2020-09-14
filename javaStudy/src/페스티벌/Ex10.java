package 페스티벌;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {

		Random r = new Random();
		byte[] randBytes = new byte[8];
		r.nextBytes(randBytes);
		System.out.print("배열에 있는 모든 값 : ");
		for (byte b : randBytes) {//배열에 있는 요소값을 처음~끝까지 하나하나 가져와서 b에 넣어 출력
		    System.out.print(b + " ");
		}
		int max = randBytes[0];
		int min = randBytes[0];

		for (int i = 0; i < randBytes.length; i++) {
			if(min>randBytes[i])
				min = randBytes[i];
			else if(max<randBytes[i])
				max = randBytes[i];
		}
		System.out.println();
		System.out.println("가장 큰 값 : "+max);
		System.out.println("가장 작은 값 : "+min);

	}

}
