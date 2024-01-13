package workbook;

public class w0622 {
	
	static boolean isNumber(String str) {
		
		if(str==null || str.isBlank()) return false;
		
		for(char ch : str.toCharArray()) {
			if(!('0'<=ch && ch<='9')) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
}
