package prob02;

public class Sol02 {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i<9; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print((10+k) + " ");
			}
			System.out.println();
		}
	
	}
}