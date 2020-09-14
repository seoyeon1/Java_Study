package 페스티벌;

public class Expressions {
	public int expressions(int num) {
		int cnt = 0;
		int sum = 0;
		int start = 1;
		for(int i=0;i<num;i++) {
			for(int k =start; k<=num;k++) {//sum<num도 가능.
				sum += k;
				if(sum==num) {
					cnt++;
					break;}

			}
			start++;
			sum=0;
		}
		
		
		
		return cnt;
	}
}
