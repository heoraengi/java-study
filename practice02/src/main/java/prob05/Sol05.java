package prob05;

public class Sol05 {
	public static void main(String[] arg) {

		int array[] = {5, 9, 3, 8, 60, 20, 1};
		int count = array.length;

		System.out.println("Before Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}

		for (int j = 0; j < count-1; j++) {
			for (int k = 0; k < count-j-1 ; k++) {
				if (array[k] < array[k+1]) {
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}

		}

		System.out.println("\n\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}