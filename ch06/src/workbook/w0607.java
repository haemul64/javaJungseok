package workbook;

public class w0607 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		// p와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2, 2));
	}
}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x, int y) {
		double x2 = Math.pow(this.x-x, 2);
		double y2 = Math.pow(this.y-y, 2);
		return Math.sqrt(x2+y2);
	}
}