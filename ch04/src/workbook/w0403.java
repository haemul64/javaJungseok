package workbook;

public class w0403 {
	public static void main(String[] args) {
		
		int sum = 0;
		int prev = 0;
		
		for(int i=1; i<=10; i++) {
			prev += i;
			sum += prev;
		}
		
		System.out.println(sum);
	}
}
