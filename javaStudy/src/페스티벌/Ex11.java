package �佺Ƽ��;



public class Ex11 {

	public static void main(String[] args) {
		String score = "A,A,B,B,B,C,C,A,D,D,F,F";
		String[] arr = score.split(",");//,�� ������ ���ڸ� string �迭�� ����.
		int a = 0;//�� �������� �л����� cnt�� ������
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i].equals("A")) {
				a+=1;}
			else if(arr[i].equals("B")) {
				b++;}
			else if(arr[i].equals("C")) {
				c++;}
			else if(arr[i].equals("D")) {
				d++;}
			else
				f++;
		}
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		System.out.println("C: "+c);
		System.out.println("D: "+d);
		System.out.println("F: "+f);
		

	}

}
