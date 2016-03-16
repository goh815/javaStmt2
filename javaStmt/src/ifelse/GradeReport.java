package ifelse;

import java.util.Scanner;

/**
 * @file GradeReport.java
 * @author USER
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라 A ~ F까지 학점부여
 * [결과]
 ***************************
 *이름	과목	   점수	  학점
 *--------------------------
 *홍길동	 영어  89점	  B
 *************************
 *90점 이상 A
 *80점 이상 B
 *70점 이상 C
 *60점 이상 D
 *50점 이상 E
 *50점 미만 F
 *만약, 입력한 점수가 100점 초과한다든지 0점 미만 이면 
 *잘못 입력했습니다 라고 메시지 주기
 */
public class GradeReport {
	 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int eng = 0;
	String name;

		System.out.println("이름을 입력하시오");
		name = scanner.next();
		System.out.println("영어점수를 입력하시오");
		eng = scanner.nextInt();
		
		if (eng >= 90 && eng <= 100) {
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   A  	");
		} else if(eng >= 80 && eng <= 89){
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   B  	");
		}else if (eng >= 70 && eng <= 79){
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   C  	");
		}else if(eng >= 60 && eng <= 69){
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   D  	");
		}else if(eng >= 50 && eng <= 59){
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   E  	");
		} else if(eng >= 0 && eng <= 49){
			System.out.println("***************************\n"
					+ "이름	과목	   점수	  학점\n"
					+ name+"    영어    "   +eng+ "   F  	");
		} else {
			System.out.println("잘못입력하였습니다.");
		}
	}
}
