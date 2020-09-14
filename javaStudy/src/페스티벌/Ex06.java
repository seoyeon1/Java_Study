package 페스티벌;

public class Ex06 {

	public static void main(String[] args) {
		int res = 0;//결과 저장
		int start = 0;//점점 값을 빼갈 시작변수
		int mul = 0;//곱 저장할 변수
		for (int i = 77; i >= 1 ; i--) {//일정 수 감소하고 그만큼 증가시키위해 i를 사용.
			start = 78-i;
			mul = start * i;
			res += mul;//곲의 결과를 저장&갱신
		}
		System.out.println(res);

	}

}
