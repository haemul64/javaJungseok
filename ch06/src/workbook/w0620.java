package workbook;

import java.util.Arrays;

public class w0620 {

	static int[] shuffle(int[] arr) {
		int[] answer = Arrays.copyOf(arr, arr.length);
		
		for(int i=0; i<answer.length; i++) {
			int num = (int)(Math.random() * answer.length);
			
			int tmp = answer[i];
			answer[i] = answer[num];
			answer[num] = tmp;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(Arrays.toString(result));
	}
}
