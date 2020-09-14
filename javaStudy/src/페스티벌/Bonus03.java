package 페스티벌;
//하사드 수
import java.util.Scanner;

public class Bonus03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(isHarshad(10));

	}

	public static boolean isHarshad(int num) {
		
		int Hsum=0;
		int start = num;
		//마지막에 합한 결과와 비교해야하니 따로 변수에 담아두고 연산 할 것을 주의하자!!
		while(start>0) {
			Hsum += start%10;
			start = start/10;//다양한 자리에 대응되게 while 사용
		}
		if(num%Hsum == 0) {
			return true;			
		}
		else {			
			return false;
		}
	}

}

//num = 1213;
//int length = (int)(Math.log10(num)+1); //4