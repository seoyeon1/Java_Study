package �佺Ƽ��;

import java.util.Scanner;

//10->2 ������ȯ
public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�>> ");
		int num = sc.nextInt();

		String result = "";
		while(num!=1) {
			if(num%2==0) {
				result = "0"+result;
			}
			else
				result = "1"+result;
			num = num/2;
			if(num==1)
				result = "1"+result;
		}
		System.out.println(result);
	}

}
