package ifelse;

import java.util.Scanner;

/**
 * @author USER
 * @date 2016. 3. 11.
 * @story 3명의 학생 정수를 받아서 1등을 
 */
public class FirstGrade {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 이름과 점수를 입력하세요.");
		String aName=scanner.next();
		int aScore =scanner.nextInt();
		String bName=scanner.next();
		int bScore =scanner.nextInt();
		String cName=scanner.next();
		int cScore =scanner.nextInt();
		if (true) {
			if(aScore>bScore&&aScore>cScore){
				System.out.println("1등은"+aName+""+aScore+"점 입니다.");
			} else if(bScore>cScore ){
				System.out.println("1등은"+bName+""+bScore+"점 입니다.");
			} else {
				System.out.println("1등은"+cName+""+cScore+"점 입니다.");
			}
		} else {
			System.out.println("잘못 입력하였습니다.");
		}
		//System.out.println("1등은 홍길동, 90점 입니다.");
	}
}
