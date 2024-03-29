package workbook;

public class w0606 {
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

	// 두 점 (x, y)와 (x1, y1) 간의 거리를 구한다.
	static double getDistance(int x, int y, int x1, int y1) {
		double x2 = Math.pow(x-x1, 2);
		double y2 = Math.pow(y-y1, 2);
		return Math.sqrt(x2+y2);
	}
}
