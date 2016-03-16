package ifelse;

import java.util.Scanner;

import javafx.scene.shape.Ellipse;

/**
 * @file Pass.java
 * @author USER
 * @date 2016. 3. 11.
 * @story 과목 점수를 입력하면 총점과 평균이 나오고 
 * 이를 통해 합격 여부를 통지하는 프로그램
 * [결과]
 * *******************************
 * 학생	자바	JSP	SQL	스프링		총점	평균	합격여부
 * 홍길동	80	40	60	70		250	62.5	합격
 * *****************************************
 * 합격 여부눈 60 이상이면 합격
 */
public class Pass {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int java=0, jsp=0, sql=0, spring=0, total = 0, avg = 0;
	String name ="";
	System.out.println("이름을 입력하세요.");
	name = scanner.next();
	
	System.out.println("자바, JSP, SQL, 스프링 순서로 점수를 입력하시오");
	java = scanner.nextInt();
	jsp = scanner.nextInt();
	sql = scanner.nextInt();
	spring =scanner.nextInt();
	
	total = java+jsp+sql+spring;
	avg = total/4;
		if (avg>=60) {
				System.out.println("**************************************************************");
				System.out.println("학생   자바   JSP   SQL   스프링   총점   평균   합격여부");
				System.out.println("**************************************************************");
				System.out.println(name+"   "+java+"   "+jsp+"   "+sql+"   "+spring+"   "+total+"   "+avg+"  합격");
			} else {
				System.out.println("**************************************************************");
				System.out.println("학생   자바   JSP   SQL   스프링   총점   평균   합격여부");
				System.out.println("**************************************************************");
				System.out.println(name+"   "+java+"   "+jsp+"   "+sql+"   "+spring+"   "+total+"   "+avg+"  불합격");
		}
	}	
}
