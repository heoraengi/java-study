package prob04;
public class Sol04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] strArr = str.toCharArray();
		char[] res = new char[strArr.length];
		for(int i = strArr.length-1; i>=0; i--) {
			res[strArr.length-i-1] = strArr[i];
		}
		return res;
	}

	public static void printCharArray(char[] array){
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}