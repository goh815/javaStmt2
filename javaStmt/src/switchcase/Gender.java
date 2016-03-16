package switchcase;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직(스위치케이스 문 사용)
 */ 
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하시오.");
		System.out.println("주민번호를 입력하시오");
		String name = scanner.next(), ssn =scanner.next(),sex ="";
		
		char flag =ssn.charAt(7);
		/**
		 * 800101-1234567
		 * charAt(인덱스값)은 인텍스에 해당하는 한 글자를 반환 
		 * 단, 인덱스는 0부터 시작함
		 * 1, 3 이면 남자  if(flag=1||flag=3)
		 * 2, 4 이면 여자
		 * 5, 6 이면 외국인 
		 * 다른 값이면 잘못된 주민번호입니다.
		 */
		switch (flag) {
		case '1': 
		case '3':sex = "남자"; break;
		case '2':
		case '4':sex = "여자"; break;
		case '5':
		case '6':sex = "외국인"; break;

		default:
		
			break;
		}
		
		System.out.println(name+"님은 "+sex+"입니다.");
	}

}
