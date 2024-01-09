package workbook;

import java.util.Scanner;

public class w0512 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] word = {"chair", "computer", "integer"};
		String[] meaning = {"의자", "컴퓨터", "정수"};
		
		int count = 0;
		
		for(int i=0; i<word.length; i++) {
			System.out.printf("%s의 뜻은? ", word[i]);
			String answer = s.nextLine();
			
			if(answer.equals(meaning[i])) {
				System.out.println("정답입니다.");
				count++;
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.\n", meaning[i]);
			}
			System.out.println();
		}
		
		System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.", word.length, count);
	}
}
