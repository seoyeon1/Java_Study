package 페스티벌;

import java.util.Arrays;

public class Bonus05 {

	public static void main(String[] args) {
		int A[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		int B[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		int Merge[] = mergeArray(A, B);

	}

	private static int[] mergeArray(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int k = a.length;
		//두 배열 합병
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				result[j] = a[j];
			}
			result[k++] = b[i];
		}
		
		Arrays.sort(result);
		
		
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}//값 넣어진 거 확인&출력
		

		return result;
	}

}
