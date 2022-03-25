package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {

		int inputnum = 12;
		int sum = 0;

		while (inputnum > 0) {

			int rem = inputnum % 10;

			sum = sum + rem;

			inputnum = inputnum / 10;
		}
		
		System.out.println(sum);
	}
}
