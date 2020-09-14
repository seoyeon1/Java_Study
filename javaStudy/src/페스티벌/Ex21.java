package Æä½ºÆ¼¹ú;

public class Ex21 {

	public static void main(String[] args) {
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int minVal = Math.abs(point[1]-point[0]);
		int[] result = new int[2];
		for(int i =0; i<point.length;i++) {
			for (int j = i+1; j < point.length; j++) {
				int distance = Math.abs(point[i]-point[j]);
				if(distance<minVal) {
					minVal = distance;
					result[0] =	i;
	                result[1] = j;
				}
			}
		}

		
		System.out.println("result = "+result[0]+"," +result[1]);
	}

}
