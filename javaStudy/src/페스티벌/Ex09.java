package 페스티벌;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 & 최소 공배수 구하기");
		System.out.print("숫자1 >> ");
		int num1 = sc.nextInt();
		System.out.print("숫자2 >> ");
		int num2 = sc.nextInt();
		
		int gcd=0;//최대공약수
		int min = 0;//최소공배수
		int tmp = 1;
		int mulNum = num1*num2;

		//num1:큰수 num2:작은수 설정.
		
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//나머지가 0이될 때까지 작은 수로 큰 수를 계속 나눔
		while(tmp > 0){//유클리드(최대공약수->num1(큰수)를 num2(작은수)로 나눈 나머지가 0이 될 때 까지 나눔.)
	        tmp=num1%num2;
	        num1=num2;//이제 num2가 큰 값이 되고, tmp를 작은 값으로 사용하여 다시 tmp가 0이될때까지 반복.
	        num2=tmp;
	      }
		gcd = num1;//최종적으로 나온 큰 값이 최대공약수가 됨.
		
		//최소공배수=두수의곱/최대공약수		
		min = mulNum / gcd;
		
		System.out.println("최대공약수: " + gcd);
		System.out.println("최소공배수: "+ min);
		
	}

}
//유클리드 호제법
//1. 두 수를 입력받는다.
//
//2. 두 수중 큰수와 작은수를 구분한다.
//
//3. 두 수를 나눈 나머지가 0일때 까지 큰수와 작은수를 나눈다.
//
//4.나머지가 0이 되는 순간 큰수가 최대공약수이다.
//
//5.처음 입력받은 두수의 곱을 최대공약수로 나누면 최소공배수가된다.
