package �佺Ƽ��;

public class Bonus01 {

	public static void main(String[] args) {
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));

	}

	public static String findKim(String[] names) {
		int x = 0;
		for(int i =0;i<names.length;i++) {
			if(names[i] == "Kim")
				x = i+1;
		}
		return "�輭���� "+x+"�� �ִ�.";
	}
	

}
