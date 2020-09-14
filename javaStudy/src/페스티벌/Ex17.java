package Æä½ºÆ¼¹ú;

public class Ex17 {

	public static void main(String[] args) {
		int num = coll(9);
		System.out.println(num);
		
		

	}

	public static int coll(int i) {
		int cnt=0;
		while(i>1) {
		if(i%2==0) {
			i = i/2;
//			cnt++;
			
		}
		else {
			i = i * 3 + 1;
//			cnt++;
		}cnt++;

//		coll(i);
		}
		return cnt;
	}

}
