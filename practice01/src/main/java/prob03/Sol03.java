package prob03;

import java.util.Scanner;

public class Sol03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("수를 입력하세요 : ");
			int num = scanner.nextInt();
			scanner.close();
			int total = 0;
			
			if (num%2==1) {
				for(int i=1; i<=num; i++) {
					if (i%2==1) {
						total += i;
					}
				}
			} else {
				for(int i=1; i<=num; i++) {
					if (i%2==0) {
						total += i;
					}
				}
			}
			
			System.out.println("결과값 : " + total);
		}
		
	}
}
