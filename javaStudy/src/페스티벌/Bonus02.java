package Æä½ºÆ¼¹ú;

public class Bonus02 {

	public static void main(String[] args) {
		System.out.println(getMiddle("teist"));

	}

	public static String getMiddle(String str) {
		String word = str;
		String[] wordList = word.split("");//new String[word.length()];
		char[] w = word.
		
//		for(int i = 0; i<word.length();i++) {
//			wordList[i] = Character.toString(word.charAt(i));
//		}
		
		if(wordList.length%2==1) {
			return wordList[wordList.length/2];
		}
		else
			return wordList[wordList.length/2 -1]+wordList[wordList.length/2];
		
	}

}
