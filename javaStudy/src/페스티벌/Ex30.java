package �佺Ƽ��;

public class Ex30 {

	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		int cnt = 1;
		int start = 3;//1�� ���� ��
		int end = 4;//1�� ������ ���� 0 �࿡ ���������� ������ �ͺ��� 1�� ū? ���� �׳� ó �ݺ��� ���� �� ��
		for(int r = 0; r<arr.length;r++) {
			for(int c = start; c<end;c++) {
				arr[c][r] = cnt++;//���� ���� �����̰� ����� �ٲ㰡�� ���� ������r�� c�� ���� c�� r�ڸ��� ��.
			}
			if(start>0&&r<4) {
			start--;
			end++;}
			
			else {
				start++;
				end--;
			}
				
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ "\t");
			}System.out.println();
		}
	}

}
