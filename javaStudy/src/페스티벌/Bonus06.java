package 페스티벌;

public class Bonus06 {

	public static void main(String[] args) {
		int aToz = 65;
		char[][] sand = new char[5][5];
		for (int i = 0; i < sand.length; i++) {//rows
			if (i <= 2) {
				for (int j = i; j < 5 - i; j++) {
					sand[i][j] = (char) aToz++;// ascii(숫자)->문자 변환
				}
			} else {
				for (int j = 4 - i; j <= i; j++)
					sand[i][j] = (char) aToz++;
			}
		}

		for (int i = 0; i < sand.length; i++) {
			for (int j = 0; j < sand.length; j++) {
				System.out.print(sand[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
