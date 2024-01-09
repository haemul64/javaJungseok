package workbook;

public class w0506 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			int unit = coinUnit[i];
			System.out.printf("%d원: %d\n", unit, money/unit);
			money %= unit;
		}
	}
}
