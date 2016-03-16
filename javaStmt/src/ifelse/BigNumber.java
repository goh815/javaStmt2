package ifelse;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰수
 */
public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[3];
		
		System.out.println("숫자를 입력하시오!");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		if (num[0] > num[1] && num[0] > num [2]) {
			System.out.println("가장 큰수는 "+num[0]);
		}else if(num[1] > num[2]) {
				System.out.println("가장 큰수는"+num[1]);
		}else {
			System.out.println("가장 큰수"+num[2]);
		}
		
	}

}


