package 페스티벌;
// ceasar crypto
public class Ex26 {

	public static void main(String[] args) {
		System.out.println(ceasar("a B z", 4));
	}
//소문자일 때 & 대문자일 때 나눠서 처리
	
	public static String ceasar(String str, int move) {
//		String[] cStr = str.split(" ");//문자로 나눠 배열 저장
		String result = "";
		
		move = move %26;//알파벳 26자
		for(int i =0; i<str.length();i++) {
			char cs = str.charAt(i);//i번쨰 들어있는 값을 char로 바꿔줌.
			if(Character.isLowerCase(cs)) {
				cs = (char)((cs-'a' + move)%26 + 'a');
				
			}
		
			else if(Character.isUpperCase(cs)) {
				cs = (char)((cs- 'A' + move)%26+'A');				
			}
			result = result + cs;
		}
		return result;

	}
}
	
