
public class PracticeProblem {
	final static int MAXIMUM = 10;

	public static void main(String args[]) {
		System.out.println(totalWordsChecker("Hello() b c d e f g h i j"));
	}

	public static int calculate(int num1, int num2, char operator){
		int result = 0;
		switch(operator){
			case('+'):
				result = num1 + num2;
				break;

			case('-'):
				result = num1 - num2;
				break;

			case('*'):
				result = num1*num2;
				break;

			case('/'):
				result = num1/num2;
				break;

			case('%'):
				result = num1%num2;
				break;

			case('^'):
				result = (int)Math.pow(num1,num2);
				break;
		}
		return result;
	}

	public static boolean totalWordsChecker(String word){
		char[] charArr = word.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (!Character.isLetter(charArr[i]) && word.charAt(i) != '_' && word.charAt(i) != '\'' && word.charAt(i) != ' '){
			charArr[i] = ' ';
			}
		}
		String[] arr = new String (charArr).split("\\s+");
		return arr.length <= MAXIMUM;
	}


	public static String minString(String str1, String str2, String str3){
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		str3 = str3.toLowerCase();
		
		if (str1.compareTo(str2) < 0 && str1.compareTo(str3) < 0){
			return str1;
		}
		else if (str2.compareTo(str1) < 0 && str2.compareTo(str3) < 0){
			return str2;
		}
		else {
			return str3;
		}
	}
}
