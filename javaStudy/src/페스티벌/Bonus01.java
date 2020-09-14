package 페스티벌;

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
		return "김서방은 "+x+"에 있다.";
	}
	

}
