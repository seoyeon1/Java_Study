package Æä½ºÆ¼¹ú;

public class Ex27 {

	public static void main(String[] args) {
		System.out.println(change124(10));
	}

	private static String change124(int input) {
		String res = "";
		int remind = 1;
		while (input > 0) {
			remind = input % 3;
			input = input / 3;
			if (remind == 0) {
				input = input - 1;
				remind = 4;
			}
			res = remind + res;
		}
		return res;
	}

}
