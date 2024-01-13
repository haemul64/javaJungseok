package workbook;

public class w0602 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class SutdaCard {
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	int num;
	boolean isKwang;
	
	String info() {
		return isKwang ? num+"K" : ""+num;
	}
}