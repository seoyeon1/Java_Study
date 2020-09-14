package 페스티벌;

public class Ex23 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];//기본배열
		int arr2[][] = new int[5][5];//회전배열
		int r=0;
		int c=0;
		int num = 1;
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				arr[r][c]=num++;
			}
		}
		System.out.println("초기 상태");
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("90도 회전 상태");
		
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){		
				arr2[r][c]=arr[c][4-r];
			}
		}
		
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				System.out.print(arr2[r][c] + "\t");
			}
			System.out.println();
		}



		

	}

}
