package week1.day2;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {

		
		int[] miss = {1,2,3,4,7,6,8};
		Arrays.sort(miss);
		System.out.println();
		for (int i = miss[0]; i < miss.length; i++) {
			if (i != miss[i-1]) {
				System.out.println(i);
				break;
				
			}
			
		}
	}

}
