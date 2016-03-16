package member;

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("[메뉴]1.회원가입 2.로그인 3.내 정보 보기 4. 내 정보 수정 5.종료");
			switch (s.nextInt()) {
			case 1:System.out.println("아이디, 비번, 이름, 주소, 생년월일 입력"); 
				service.join(new MemberBean(s.next(),s.next(),s.next(),s.next(),s.nextInt()));
				break;
				
			case 2: service.login(s.next(),s.next()); 
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 0: System.out.println("시스템 종료"); return;

			default:
				return;
			}
		}
	}
}
