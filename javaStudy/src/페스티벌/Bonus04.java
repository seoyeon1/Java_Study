package 페스티벌;
//멀리 뛰기

public class Bonus04 {

	public static void main(String[] args) {
		System.out.println(jumpCase(7));
	}

	public static int jumpCase(int i) {
		int jcase = 0;// 전부 1칸씩 건널 때 case
		int n1 = 1;
		int n2 = 1;
		if (i == 1 || i == 2) {
			jcase = i;
		} else {

			for (int j = 1; j < i; j++) {
				jcase = n1 + n2;
				n1 = n2;
				n2 = jcase;
			}
		}
		return jcase;
	}

}

//sol2(피보나치?)

//int sum = 0;
//
//if ( i == 1 || i == 2 ) {
//    sum = i;
//} else {
//    for (int inx = 3; inx <= i; inx++) {
//        sum = jumpCase(inx-2)+jumpCase(inx-1);
//    }
//}
//return sum;
