package �佺Ƽ��;
// ceasar crypto
public class Ex26 {

	public static void main(String[] args) {
		System.out.println(ceasar("a B z", 4));
	}
//�ҹ����� �� & �빮���� �� ������ ó��
	
	public static String ceasar(String str, int move) {
//		String[] cStr = str.split(" ");//���ڷ� ���� �迭 ����
		String result = "";
		
		move = move %26;//���ĺ� 26��
		for(int i =0; i<str.length();i++) {
			char cs = str.charAt(i);//i���� ����ִ� ���� char�� �ٲ���.
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
	
