package 페스티벌;

public class Ex24 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int arr2[][] = new int[5][5];
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
		
		System.out.println("180도 회전 상태");
		
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){	
				arr2[r][c]=arr[c][4-r];//90도
			}
		}
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){	
				arr[r][c]=arr2[c][4-r];
			}
		}
		
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}



		

	}

}
//arr2[r][c]=arr[4-c][4-r]
//25	20	15	10	5	
//24	19	14	9	4	
//23	18	13	8	3	
//22	17	12	7	2	
//21	16	11	6	1


//arr2[r][c]=arr[4-c][r];
//21	16	11	6	1	
//22	17	12	7	2	
//23	18	13	8	3	
//24	19	14	9	4	
//25	20	15	10	5