package Æä½ºÆ¼¹ú;

public class Ex28 {

	public static void main(String[] args) {
		String str = "01001101";
		System.out.print(str+"(2)->");
		int sum = 0;
		int i =0;
		int stand = 2;
		String arr[] = str.split("");
			for(int j=arr.length-1; j>0; j--) {
				if(arr[j].equals("1"))
					sum = sum + ((int)Math.pow(stand,7-j));
			}
			System.out.println(sum+"(10)");

	}

}
