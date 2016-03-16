package forloop;

import java.util.Scanner;

/**
 * @author 문고훈
 * @date 2016. 3. 11.
 * @story 5의 백수의 갯수와 합
 */
public class FacktorOf5Main {
	/**
	 * [결과]
	 * 1에서 100까지 정수까지 
	 * 5 배수의 갯수는 20이고
	 * 5 배수의 합은 1050이다
	 * 
	 **/
	public static void main(String[] args) {
		int endNum=0, count=0, sum=0;
		Scanner scanner = new Scanner(System.in);
		
		FacktorOf5 f = new FacktorOf5();
		
		System.out.println("리미트값 입력");
		f.setEndNum(scanner.nextInt());
		
		
		System.out.println("1에서 "+f.getEndNum()+"까지 정수까지"
				+" 5 배수의 갯수는"+f.getCount()+"이고"
				+" 5 배수의 합은 "+f.getSum()+"이다");
	}

}
