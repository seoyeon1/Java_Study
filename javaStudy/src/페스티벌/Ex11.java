package 페스티벌;



public class Ex11 {

	public static void main(String[] args) {
		String score = "A,A,B,B,B,C,C,A,D,D,F,F";
		String[] arr = score.split(",");//,로 나눠서 문자를 string 배열에 저장.
		int a = 0;//각 점수맞은 학생수를 cnt할 변수들
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
