package week1.day2;

public class ArrayInntersection {

	public static void main(String[] args) {
		int count = 0;
		int[] first = { 3, 2, 11, 4, 6, 7 };
		int[] second = { 1, 2, 8, 4, 9, 7 };

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					System.out.println("The Intersection Numbers are :" + first[i]);
				}
			}
		}

	}

}
