package ifelse;

import java.util.Scanner;

/**
 * @file LeapYear.java
 * @author USER
 * @date 2016. 3. 11.
 * @story 윤년 프로그램
 *연도를 4로 나눈값이 0이라면 윤년일 수 있다
 *그러나 해당 년도가 100으로 나눠 떨어지면 평년이다
 *그 중 100으로 나눠떨어지더라도 다시 400으로 나눠 떨어지면 윤년이다
 *예를 들면 1000년은 평년.2000년은 윤년.2016년은 윤년입니다. 
 */
public class LeapYear {
	public static void main(String[] args) {
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("판별하려는 년도를 입력");
		int y=scanner.nextInt();

		if( y%400==0) {
			System.out.println("윤년1");
		} else if(y%4==0 && y%100!=0) {
			System.out.println("윤년2");
		}else{
			System.out.println("평년");
		}*/
		
		
		System.out.println(10/3 +" "+ 10%3 );
	}
}
