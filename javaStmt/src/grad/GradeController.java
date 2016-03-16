package grad;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class GradeController {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		GradeServiceImpl service = new GradeServiceImpl();
		
		
		while(true){
		System.out.println("[메뉴] 1.등록 2.수정 3삭제 4.조회 5.조회(이름) 6.조회(학번) 7.회원수 0.종료");
		
		switch (s.nextInt()) {
		case 1:
			System.out.println("학번, 이름, 자바, SQL, JSP, 스프링 점수를 입력하시오.");
			
			service.input(new GradeBean(s.nextInt(),s.next(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
			break;
		case 2:
			System.out.println("수정하려는 성적표의 학번,자바,SQL,JSP.스프링");
			int hak = s.nextInt();
				String name = service.getGradeByHak(hak).getName();
				System.out.println(service.update(new GradeBean(hak, name,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt())));
			break;
		case 3:
			System.out.println("삭제할 학번을 입력하시오.");
			System.out.println(service.delete(s.nextInt()));
			break;
		case 4:
			System.out.println(service.getList());
			
			break;
		case 5:
			System.out.println("조회할 이름를 입력하시오");
			ArrayList<GradeBean>tempList = service.getGradeByName(s.next());
			System.out.println((tempList.size() == 0)? "조회한 이름이 없습니다." : tempList);
			break;			
		case 6:
			System.out.println("조회할 학번을 입력하시오");
			GradeBean temp = service.getGradeByHak(s.nextInt());
			System.out.println((temp.getName() == null) ? "조회하려는 학번이 없습니다.": temp.toString());
			break;		
		case 7:
			System.out.println(service.getCount());
			break;	
		case 0:
			System.out.println("프로그램 종료");
			return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		}
	}
}
