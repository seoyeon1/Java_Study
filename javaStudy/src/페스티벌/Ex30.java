package 페스티벌;

public class Ex30 {

	public static void main(String[] args) {
		int[][] arr = new int[7][7];
		int cnt = 1;
		int start = 3;//1이 찍힐 행
		int end = 4;//1이 찍히고 나서 0 행에 마지막으로 찍히는 것보다 1개 큰? 몰라 그냥 처 반복묵 끝날 때 닶
		for(int r = 0; r<arr.length;r++) {
			for(int c = start; c<end;c++) {
				arr[c][r] = cnt++;//열을 거의 고정이고 행들을 바꿔가면 값을 넣으니r이 c에 들어가고 c가 r자리게 들어감.
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
