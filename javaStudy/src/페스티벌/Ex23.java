package �佺Ƽ��;

public class Ex23 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];//�⺻�迭
		int arr2[][] = new int[5][5];//ȸ���迭
		int r=0;
		int c=0;
		int num = 1;
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				arr[r][c]=num++;
			}
		}
		System.out.println("�ʱ� ����");
		for(r=0;r<=4;r++){
			for(c=0;c<=4;c++){
				
				System.out.print(arr[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("90�� ȸ�� ����");
		
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
