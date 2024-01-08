package workbook;

public class w0404 {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(sum<100) {
			sum += num;
			if(sum>=100) break;
			if(num>0) num = (num+1) * -1;
			else num = (num-1) * -1;
		}
		
		System.out.print("sum: " + sum + "\n");
		System.out.print("num: " + num);
	}
}
