package prob05;

public class Sol05 {
	public static void main(String[] args) {

		for(int i=1; i<=100; i++) {
			String number = String.valueOf(i);
			String clap = "";
			
			char[] numArr = number.toCharArray();
			for (int j=0; j<numArr.length; j++) {
				int num = numArr[j] - '0';
				if (num%3 == 0 && num != 0) {
					clap += "짝";
				}
			}
			if (clap.length() > 0) {
			
				System.out.println(i + " " + clap);
			}
			
		}

	}
}
