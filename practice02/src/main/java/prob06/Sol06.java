package prob06;

import java.util.Random;
import java.util.Scanner;

public class Sol06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			
			/* 게임 작성 */
			System.out.println("수를 결정하였습니다. 맞추어 보세요:");
			int startNum = 1;
			int endNum = 100;
			int count = 1;
			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt(100) + 1;
			System.out.println(correctNumber);
			
			
			while(true) {
				System.out.println(startNum + "-" + endNum);
				System.out.print(count + ">>");
				int chooseNum = scanner.nextInt();
				
				if (chooseNum == correctNumber) {
					System.out.println("맞췄습니다.");
					break;
				} 
				
				count += 1;
				
				if (chooseNum > correctNumber) {
					System.out.println("더 낮게");
					endNum = chooseNum;
				} else {
					System.out.println("더 높게");
					startNum = chooseNum;
				}
				
			}
			
			//새 게임 여부 확인하기
			System.out.print("다시 하겠습니까(y/n)>>");
			String answer = scanner.next();
			if("y".equals(answer) == false) {
				break;
			}
		}
		
		scanner.close();
	}
}