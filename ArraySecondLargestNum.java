package week1.day2;

import java.util.Arrays;

public class ArraySecondLargestNum {

	public static void main(String[] args) {

		int[] array = { 10, 13, 43, 100, 78, 40 };
		System.out.println(array.length);

		Arrays.sort(array);

		System.out.println(array[array.length - 2]);

	}

}
